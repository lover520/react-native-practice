//import liraries
import React from 'react';
import {NativeModules} from 'react-native';
import Bluetooth from './Bluetooth';
import HomePage from './homepage';
import {NavigationContainer} from '@react-navigation/native';
import {createBottomTabNavigator} from '@react-navigation/bottom-tabs';

const Tab = createBottomTabNavigator();
const MyClass = () => {
  const cheroModule = NativeModules.CheroModule;
  cheroModule.initialize();
  cheroModule.getVersion((a: Number) => {
    console.log('mydebug:', a);
  });
  return (
    <>
      <NavigationContainer>
        <Tab.Navigator>
          <Tab.Screen name="Home" component={HomePage} />
          <Tab.Screen name="Settings" component={Bluetooth} />
        </Tab.Navigator>
        {/* Rest of your app code */}
      </NavigationContainer>
    </>
  );
};
export default MyClass;
