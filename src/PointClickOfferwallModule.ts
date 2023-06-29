import { NativeModules } from 'react-native';

const { PointClickOfferwallModule } = NativeModules;

interface PointClickOfferwallModuleInterface {
  showOfferwall(title: String): Promise<void>;
}

export default PointClickOfferwallModule as PointClickOfferwallModuleInterface;
