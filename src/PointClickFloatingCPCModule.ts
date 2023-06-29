import { NativeModules } from 'react-native';
import type { FloatingBtnTemplate } from './types';

const { PointClickFloatingCPCModule } = NativeModules;

interface PointClickFloatingCPCModuleInterface {
  showFloatingCPC(
    title: String,
    btnTemplate: FloatingBtnTemplate
  ): Promise<void>;
}

export default PointClickFloatingCPCModule as PointClickFloatingCPCModuleInterface;
