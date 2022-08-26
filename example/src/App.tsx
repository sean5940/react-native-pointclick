import * as React from 'react';

import { Button, StyleSheet, View } from 'react-native';
import { showOfferwall } from 'react-native-pointclick-rn';

export default function App() {
  return (
    <View style={styles.container}>
      <Button
        title="test1"
        onPress={() => {
          showOfferwall('test', { placementUid: '2', pickerUid: 'wook101' });
        }}
      >
        test
      </Button>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
