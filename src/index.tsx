import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-pointclick-rn' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

const PointclickRn = NativeModules.PointclickRn
  ? NativeModules.PointclickRn
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export interface adInfo {
  placementUid: string;
  pickerUid: string;
}
export function showOfferwall(title: String, adInfo: adInfo): void {
  return PointclickRn.showOfferwall(title, adInfo);
}
