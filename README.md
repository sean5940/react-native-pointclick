# react-native-pointclick-rn

pointclick

## Installation

```sh
yarn install react-native-pointclick-rn
```

## Usage

```js
import {
  FloatingBtnTemplate,
  PointClickOfferwall,
  PointClickAd,
  PointClickFloatingCPC,
} from '@doohub/react-native-pointclick-rn';
import * as React from 'react';
import { useEffect } from 'react';

import { Button, StyleSheet, View } from 'react-native';

export default function App() {
  useEffect(() => {
    PointClickAd.init({ placementUid: '2', pickerUid: 'wook101' });
  }, []);

  return (
    <View style={styles.container}>
      <Button
        title="show offerwall"
        onPress={() => {
          PointClickOfferwall.showOfferwall('test');
        }}
      />

      <View style={styles.buttonContainer}>
        <Button
          title="show floating cpc"
          onPress={() => {
            PointClickFloatingCPC.showFloatingCPC(
              'test',
              FloatingBtnTemplate.FLOATING_BTN_ORANGE
            );
          }}
        />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'pink',
  },
  buttonContainer: {
    marginVertical: 20,
  },
});

```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
