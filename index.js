import React from "react";
import { View, PanResponder, NativeModules, Platform } from "react-native";

const { RNDevmenuTrigger, DevMenu } = NativeModules;

const responder = PanResponder.create({
  onStartShouldSetPanResponder: (evt, gestureState) => {
    if (gestureState.numberActiveTouches === 3) {
      if (Platform.OS === "ios") {
        DevMenu.show();
      } else if (Platform.OS === "android") {
        RNDevmenuTrigger.show();
      }
    }
    return false;
  }
});

const withDevMenuTrigger = WrappedComponent => props => {
  if (!__DEV__) {
    return <WrappedComponent {...props} />;
  }
  return (
    <View
      style={{
        flex: 1,
        backgroundColor: null
      }}
      {...responder.panHandlers}>
      <WrappedComponent {...props} />
    </View>
  );
};

export { withDevMenuTrigger };
