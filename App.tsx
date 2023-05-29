//import liraries
import React from 'react';
import {View, Text, StyleSheet, NativeModules} from 'react-native';
import Bluetooth from './Bluetooth';
// create a component
const MyClass = () => {
  const cheroModule = NativeModules.CheroModule;
  cheroModule.getVersion((a: Number) => {
    console.log('mydebug:', a);
  });
  return (
    <View style={styles.container}>
      <Bluetooth />
      <Text>MyClass</Text>
    </View>
  );
};

// define your styles
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#2c3e50',
  },
});

//make this component available to the app
export default MyClass;
