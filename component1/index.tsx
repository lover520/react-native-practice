//import liraries
import React, {Component} from 'react';
import {View, Text} from 'react-native';

// create a component
class Component1 extends Component {
  render() {
    return (
      <View>
        <Text>this is component1</Text>
      </View>
    );
  }
}

// define your styles
// const styles = StyleSheet.create({
//   container: {
//     width: 100,
//     justifyContent: 'center',
//     alignItems: 'center',
//     backgroundColor: '#2c3e50',
//   },
// });

//make this component available to the app
export default Component1;
