//import liraries
import React from 'react';
import {View, Text, StyleSheet} from 'react-native';

// create a component
const HomePage = () => {
  return (
    <View style={styles.container}>
      <Text>HomePage</Text>
    </View>
  );
};

// define your styles
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#0abab5',
  },
});

//make this component available to the app
export default HomePage;
