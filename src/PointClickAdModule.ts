import { NativeModules } from 'react-native';
import type { adInfo } from './types';

const { PointClickAdModule } = NativeModules;

interface PointClickAdModuleInterface {
  init(adInfo: adInfo): Promise<void>;
}

export default PointClickAdModule as PointClickAdModuleInterface;
