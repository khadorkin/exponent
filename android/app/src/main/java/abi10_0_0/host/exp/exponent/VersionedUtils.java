// Copyright 2015-present 650 Industries. All rights reserved.

package abi10_0_0.host.exp.exponent;

import abi10_0_0.com.facebook.react.LifecycleState;
import abi10_0_0.com.facebook.react.ReactInstanceManager;
import abi10_0_0.com.facebook.react.shell.MainReactPackage;
import host.exp.expoview.Exponent;

public class VersionedUtils {

  public static ReactInstanceManager.Builder getReactInstanceManagerBuilder(Exponent.InstanceManagerBuilderProperties instanceManagerBuilderProperties) {
    ReactInstanceManager.Builder builder = ReactInstanceManager.builder()
        .setApplication(instanceManagerBuilderProperties.application)
        .setJSBundleFile(instanceManagerBuilderProperties.jsBundlePath)
        .addPackage(new MainReactPackage())
        .addPackage(new ExponentPackage(instanceManagerBuilderProperties.experienceProperties,
                instanceManagerBuilderProperties.manifest))
        .setInitialLifecycleState(LifecycleState.RESUMED);
    return builder;
  }

}
