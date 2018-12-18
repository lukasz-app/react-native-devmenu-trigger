# react-native-devmenu-trigger

[![npm version](https://badge.fury.io/js/react-native-devmenu-trigger.svg)](https://badge.fury.io/js/react-native-devmenu-trigger)

Lightweight React Native helper library. It allows to trigger dev menu by tapping on the screen with 3 fingers.

## Getting started

`$ yarn add react-native-devmenu-trigger`

or

`$ npm install react-native-devmenu-trigger --save`

### Mostly automatic installation

`$ react-native link react-native-devmenu-trigger`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNDevmenuTriggerPackage;` to the imports at the top of the file
- Add `new RNDevmenuTriggerPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-devmenu-trigger'
   project(':react-native-devmenu-trigger').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-devmenu-trigger/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     implementation project(':react-native-devmenu-trigger')
   ```

#### iOS

iOS does not require additional config

## Usage

```javascript
import { withDevMenuTrigger } from 'react-native-devmenu-trigger';

// decorate your main react native component

@withDevMenuTrigger
export default class App extends Component {
  render() {
    return (
      <View style={{ flex: 1 }}>
       // other components
      </View>
    );
  }
}

// or use as function

class App extends Component {
  render() {
    return (
      <View style={{ flex: 1 }}>
       // other components
      </View>
    );
  }
}

export default withDevMenuTrigger(App);
```
