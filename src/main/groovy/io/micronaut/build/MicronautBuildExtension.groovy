package io.micronaut.build

import org.gradle.api.artifacts.ResolutionStrategy

class MicronautBuildExtension {

    /**
     * The default source compatibility
     */
    String sourceCompatibility = '1.8'
    /**
     * The default target compatibility
     */
    String targetCompatibility = '1.8'

    /**
     * The checkstyle version
     */
    String checkstyleVersion = '8.33'

    /**
     * The default dependency update pattern
     */
    String dependencyUpdatesPattern = /.+(-|\.?)(b|M|RC)\d.*/

    Closure resolutionStrategy

    /**
     * Whether to use enforced platform when applying BOM
     */
    boolean enforcedPlatform = false

    /**
     * Whether to enable Micronaut annotation processing
     */
    boolean enableProcessing = false

    /**
     * Whether to enable the Micronaut BOM for dependency management
     */
    boolean enableBom = true

    void resolutionStrategy(@DelegatesTo(ResolutionStrategy) Closure closure) {
        this.resolutionStrategy = closure
    }

}
