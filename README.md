# Jetpack SDP/SSP Library

A Jetpack Compose library for handling scalable density pixels (SDP) and scalable sp (SSP).

## Features

- Provides an easy way to use scalable density pixels (SDP) and scalable sp (SSP) in Jetpack Compose.
- Helps to maintain consistent spacing and font size across different screen sizes and densities.

## Installation

To use this library in your project, add the following to your `settings.gradle` file:

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
Then, add the dependency in your build.gradle file:

dependencies {
    implementation 'com.github.muhammad-ahmed-lib:Jetpack-sdp-ssp:alpha-1.0'
}
## Usage
Scalable Density Pixels (SDP)
To use scalable density pixels in your Jetpack Compose project:

kotlin
import com.jetpack_sdp_ssp_lib.sdp
import androidx.compose.ui.unit.dp

val padding = 16.sdp // equivalent to 16dp but scalable
Scalable SP (SSP)
To use scalable SP in your Jetpack Compose project:

import com.jetpack_sdp_ssp_lib.ssp
import androidx.compose.ui.unit.sp

val textSize = 14.ssp // equivalent to 14sp but scalable
