# react-native-devmenu-trigger

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
     compile project(':react-native-devmenu-trigger')
   ```

## Usage

```javascript
import { withDevMenuTrigger } from 'react-native-devmenu-trigger';

// decorate your main react native component

@withDevMenuTrigger
export default class App extends Component {
  render() {
    return (
      <View style={{ flex: 1 }}>
       <MyOtherViews/>
      </View>
    );
  }
}

// or use as function

class App extends Component {
  render() {
    return (
      <View style={{ flex: 1 }}>
       <MyOtherViews/>
      </View>
    );
  }
}

export default withDevMenuTrigger(App);
```
