package com.logging;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.Feature;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;


public class LoggingExtensionProcessor {
   @BuildStep
    FeatureBuildItem feature(){
       return new FeatureBuildItem("logging-lib");
   }
   @BuildStep
    void addBeans(BuildProducer<AdditionalBeanBuildItem> additionalBeans){
       additionalBeans.produce(new AdditionalBeanBuildItem(JLogger.class));
   }
}
