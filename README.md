# Questionnaire Analysis using Image Analysis 

Questionnaire Analysis using Image Analysis Application was created to help solve questionnaire analysis problems that take extensive analysis and processing time that can lead to errors.

## Description

Questionnaire Analysis using Image Analysis Application is an app that can make it easier  to fill out and sort data into statistical programs. By the function of this app, it will take a picture of the questionnaire paper and analyzed according to the specified patterns. The data will be exported as a .csv file. and can be automatically applied to the statistical program through the collection of this application. This reduces the time and error of filling in statistical programs   even more.

## Getting Started

### Prerequisite

* [Install - Android Studio](https://developer.android.com/studio)
* [Install - Python 3](https://www.python.org/downloads/)
* [Install - Chaquopy](https://chaquo.com/chaquopy/doc/current/android.html)

### Library

Please install library before run the code

* opencv (for cv2)

```
pip install opencv-python
```
* numpy 
```
pip install numpy
```

### Open Project on Android Studio
1. Clone repository
```
git clone https://github.com/nuthathaina/QuestionnairAnalysis
```
2. Open Android Studio and add QuestionnairAnalysis project
3. Open QuestionnairAnalysis project

### Directory Structure
```
QuestionnairAnalysis:.
├───.gradle
│   ├───6.5
│   │   ├───executionHistory
│   │   ├───fileChanges
│   │   ├───fileContent
│   │   ├───fileHashes
│   │   ├───javaCompile
│   │   └───vcsMetadata-1
│   ├───buildOutputCleanup
│   ├───checksums
│   └───vcs-1
├───.idea
│   ├───caches
│   ├───codeStyles
│   ├───libraries
│   └───modules
│       └───app
├───app
│   ├───build
│   │   ├───generated
│   │   │   ├───ap_generated_sources
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───not_namespaced_r_class_sources
│   │   │   │   └───debug
│   │   │   │       └───r
│   │   │   │           ├───android
│   │   │   │           │   ├───arch
│   │   │   │           │   │   ├───core
│   │   │   │           │   │   └───lifecycle
│   │   │   │           │   │       ├───livedata
│   │   │   │           │   │       │   └───core
│   │   │   │           │   │       └───viewmodel
│   │   │   │           │   └───support
│   │   │   │           │       ├───asynclayoutinflater
│   │   │   │           │       ├───compat
│   │   │   │           │       ├───constraint
│   │   │   │           │       ├───coordinatorlayout
│   │   │   │           │       ├───coreui
│   │   │   │           │       ├───coreutils
│   │   │   │           │       ├───cursoradapter
│   │   │   │           │       ├───customview
│   │   │   │           │       ├───design
│   │   │   │           │       ├───documentfile
│   │   │   │           │       ├───drawerlayout
│   │   │   │           │       ├───fragment
│   │   │   │           │       ├───graphics
│   │   │   │           │       │   └───drawable
│   │   │   │           │       ├───interpolator
│   │   │   │           │       ├───loader
│   │   │   │           │       ├───localbroadcastmanager
│   │   │   │           │       ├───print
│   │   │   │           │       ├───slidingpanelayout
│   │   │   │           │       ├───swiperefreshlayout
│   │   │   │           │       ├───transition
│   │   │   │           │       └───v7
│   │   │   │           │           ├───appcompat
│   │   │   │           │           ├───cardview
│   │   │   │           │           ├───recyclerview
│   │   │   │           │           └───viewpager
│   │   │   │           ├───androidx
│   │   │   │           │   └───versionedparcelable
│   │   │   │           └───com
│   │   │   │               ├───bumptech
│   │   │   │               │   └───glide
│   │   │   │               │       └───gifdecoder
│   │   │   │               └───elevenzon
│   │   │   │                   └───image
│   │   │   ├───python
│   │   │   │   ├───assets
│   │   │   │   │   └───debug
│   │   │   │   │       ├───app
│   │   │   │   │       │   └───chaquopy
│   │   │   │   │       ├───build
│   │   │   │   │       │   └───chaquopy
│   │   │   │   │       ├───license
│   │   │   │   │       │   └───chaquopy
│   │   │   │   │       ├───misc
│   │   │   │   │       │   └───chaquopy
│   │   │   │   │       │       └───bootstrap-native
│   │   │   │   │       │           ├───arm64-v8a
│   │   │   │   │       │           │   └───java
│   │   │   │   │       │           ├───armeabi-v7a
│   │   │   │   │       │           │   └───java
│   │   │   │   │       │           ├───x86
│   │   │   │   │       │           │   └───java
│   │   │   │   │       │           └───x86_64
│   │   │   │   │       │               └───java
│   │   │   │   │       └───requirements
│   │   │   │   │           └───chaquopy
│   │   │   │   ├───jniLibs
│   │   │   │   │   └───debug
│   │   │   │   │       ├───arm64-v8a
│   │   │   │   │       ├───armeabi-v7a
│   │   │   │   │       ├───x86
│   │   │   │   │       └───x86_64
│   │   │   │   ├───pip
│   │   │   │   │   └───_vendor
│   │   │   │   │       └───certifi
│   │   │   │   ├───proxies
│   │   │   │   │   └───debug
│   │   │   │   └───sources
│   │   │   │       └───debug
│   │   │   ├───res
│   │   │   │   ├───pngs
│   │   │   │   │   └───debug
│   │   │   │   │       ├───drawable-anydpi-v21
│   │   │   │   │       ├───drawable-anydpi-v24
│   │   │   │   │       ├───drawable-hdpi
│   │   │   │   │       ├───drawable-ldpi
│   │   │   │   │       ├───drawable-mdpi
│   │   │   │   │       ├───drawable-xhdpi
│   │   │   │   │       ├───drawable-xxhdpi
│   │   │   │   │       └───drawable-xxxhdpi
│   │   │   │   └───resValues
│   │   │   │       └───debug
│   │   │   └───source
│   │   │       └───buildConfig
│   │   │           └───debug
│   │   │               └───com
│   │   │                   └───elevenzon
│   │   │                       └───image
│   │   ├───intermediates
│   │   │   ├───aar_metadata_check
│   │   │   │   └───debug
│   │   │   ├───annotation_processor_list
│   │   │   │   └───debug
│   │   │   ├───apk_list
│   │   │   │   └───debug
│   │   │   │       └───mainApkListPersistenceDebug
│   │   │   ├───blame
│   │   │   │   └───res
│   │   │   │       └───debug
│   │   │   │           ├───multi-v2
│   │   │   │           └───single
│   │   │   ├───bundle_manifest
│   │   │   │   └───debug
│   │   │   │       ├───bundle-manifest
│   │   │   │       └───processDebugManifest
│   │   │   │           └───bundle-manifest
│   │   │   ├───check_manifest_result
│   │   │   │   └───debug
│   │   │   │       └───checkDebugManifest
│   │   │   │           └───out
│   │   │   ├───compatible_screen_manifest
│   │   │   │   └───debug
│   │   │   ├───compile_and_runtime_not_namespaced_r_class_jar
│   │   │   │   └───debug
│   │   │   ├───compressed_assets
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           └───assets
│   │   │   │               └───chaquopy
│   │   │   │                   └───bootstrap-native
│   │   │   │                       ├───arm64-v8a
│   │   │   │                       │   └───java
│   │   │   │                       ├───armeabi-v7a
│   │   │   │                       │   └───java
│   │   │   │                       ├───x86
│   │   │   │                       │   └───java
│   │   │   │                       └───x86_64
│   │   │   │                           └───java
│   │   │   ├───data_binding_layout_info_type_merge
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───dex
│   │   │   │   └───debug
│   │   │   │       └───mergeDexDebug
│   │   │   ├───dex_archive_input_jar_hashes
│   │   │   │   └───debug
│   │   │   ├───dex_number_of_buckets_file
│   │   │   │   └───debug
│   │   │   ├───duplicate_classes_check
│   │   │   │   └───debug
│   │   │   ├───external_libs_dex
│   │   │   │   └───debug
│   │   │   │       └───mergeExtDexDebug
│   │   │   ├───external_libs_dex_archive
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───external_libs_dex_archive_with_artifact_transforms
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───incremental
│   │   │   │   ├───debug-mergeJavaRes
│   │   │   │   │   └───zip-cache
│   │   │   │   ├───debug-mergeNativeLibs
│   │   │   │   │   └───zip-cache
│   │   │   │   ├───mergeDebugAssets
│   │   │   │   ├───mergeDebugJniLibFolders
│   │   │   │   ├───mergeDebugResources
│   │   │   │   │   ├───merged.dir
│   │   │   │   │   └───stripped.dir
│   │   │   │   ├───mergeDebugShaders
│   │   │   │   ├───packageDebug
│   │   │   │   │   └───tmp
│   │   │   │   │       └───debug
│   │   │   │   │           └───zip-cache
│   │   │   │   └───processDebugResources
│   │   │   ├───instant_app_manifest
│   │   │   │   └───debug
│   │   │   ├───javac
│   │   │   │   └───debug
│   │   │   │       └───classes
│   │   │   │           └───com
│   │   │   │               └───elevenzon
│   │   │   │                   └───image
│   │   │   ├───manifest_merge_blame_file
│   │   │   │   └───debug
│   │   │   ├───merged_assets
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           └───chaquopy
│   │   │   │               └───bootstrap-native
│   │   │   │                   ├───arm64-v8a
│   │   │   │                   │   └───java
│   │   │   │                   ├───armeabi-v7a
│   │   │   │                   │   └───java
│   │   │   │                   ├───x86
│   │   │   │                   │   └───java
│   │   │   │                   └───x86_64
│   │   │   │                       └───java
│   │   │   ├───merged_java_res
│   │   │   │   └───debug
│   │   │   ├───merged_jni_libs
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           ├───arm64-v8a
│   │   │   │           ├───armeabi-v7a
│   │   │   │           ├───x86
│   │   │   │           └───x86_64
│   │   │   ├───merged_manifest
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───merged_manifests
│   │   │   │   └───debug
│   │   │   ├───merged_native_libs
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           └───lib
│   │   │   │               ├───arm64-v8a
│   │   │   │               ├───armeabi-v7a
│   │   │   │               ├───x86
│   │   │   │               └───x86_64
│   │   │   ├───merged_res_blame_folder
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           ├───multi-v2
│   │   │   │           └───single
│   │   │   ├───merged_shaders
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───metadata_feature_manifest
│   │   │   │   └───debug
│   │   │   │       ├───metadata-feature
│   │   │   │       └───processDebugManifest
│   │   │   │           └───metadata-feature
│   │   │   ├───mixed_scope_dex_archive
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───navigation_json
│   │   │   │   └───debug
│   │   │   ├───packaged_manifests
│   │   │   │   └───debug
│   │   │   ├───processed_res
│   │   │   │   └───debug
│   │   │   │       ├───out
│   │   │   │       └───processDebugResources
│   │   │   │           └───out
│   │   │   ├───project_dex_archive
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           └───com
│   │   │   │               └───elevenzon
│   │   │   │                   └───image
│   │   │   ├───res
│   │   │   │   ├───merged
│   │   │   │   │   └───debug
│   │   │   │   └───symbol-table-with-package
│   │   │   │       └───debug
│   │   │   ├───runtime_symbol_list
│   │   │   │   └───debug
│   │   │   ├───shader_assets
│   │   │   │   └───debug
│   │   │   │       └───compileDebugShaders
│   │   │   │           └───out
│   │   │   ├───signing_config
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───stripped_native_libs
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   │           └───lib
│   │   │   │               ├───arm64-v8a
│   │   │   │               ├───armeabi-v7a
│   │   │   │               ├───x86
│   │   │   │               └───x86_64
│   │   │   ├───sub_project_dex_archive
│   │   │   │   └───debug
│   │   │   │       └───out
│   │   │   ├───symbols
│   │   │   │   └───debug
│   │   │   ├───symbol_list_with_package_name
│   │   │   │   └───debug
│   │   │   ├───transforms
│   │   │   │   └───dexBuilder
│   │   │   │       └───debug
│   │   │   │           └───0
│   │   │   │               ├───android
│   │   │   │               │   ├───arch
│   │   │   │               │   │   ├───core
│   │   │   │               │   │   └───lifecycle
│   │   │   │               │   │       ├───livedata
│   │   │   │               │   │       │   └───core
│   │   │   │               │   │       └───viewmodel
│   │   │   │               │   └───support
│   │   │   │               │       ├───asynclayoutinflater
│   │   │   │               │       ├───compat
│   │   │   │               │       ├───constraint
│   │   │   │               │       ├───coordinatorlayout
│   │   │   │               │       ├───coreui
│   │   │   │               │       ├───coreutils
│   │   │   │               │       ├───cursoradapter
│   │   │   │               │       ├───customview
│   │   │   │               │       ├───design
│   │   │   │               │       ├───documentfile
│   │   │   │               │       ├───drawerlayout
│   │   │   │               │       ├───fragment
│   │   │   │               │       ├───graphics
│   │   │   │               │       │   └───drawable
│   │   │   │               │       ├───interpolator
│   │   │   │               │       ├───loader
│   │   │   │               │       ├───localbroadcastmanager
│   │   │   │               │       ├───print
│   │   │   │               │       ├───slidingpanelayout
│   │   │   │               │       ├───swiperefreshlayout
│   │   │   │               │       ├───transition
│   │   │   │               │       └───v7
│   │   │   │               │           ├───appcompat
│   │   │   │               │           ├───cardview
│   │   │   │               │           ├───recyclerview
│   │   │   │               │           └───viewpager
│   │   │   │               ├───androidx
│   │   │   │               │   └───versionedparcelable
│   │   │   │               └───com
│   │   │   │                   ├───bumptech
│   │   │   │                   │   └───glide
│   │   │   │                   │       └───gifdecoder
│   │   │   │                   └───elevenzon
│   │   │   │                       └───image
│   │   │   └───validate_signing_config
│   │   │       └───debug
│   │   ├───outputs
│   │   │   ├───apk
│   │   │   │   └───debug
│   │   │   └───logs
│   │   ├───pip
│   │   │   └───debug
│   │   │       ├───arm64-v8a
│   │   │       │   ├───chaquopy
│   │   │       │   │   └───lib
│   │   │       │   ├───cv2
│   │   │       │   └───numpy
│   │   │       │       ├───core
│   │   │       │       │   ├───include
│   │   │       │       │   │   └───numpy
│   │   │       │       │   └───lib
│   │   │       │       ├───distutils
│   │   │       │       ├───fft
│   │   │       │       ├───linalg
│   │   │       │       └───random
│   │   │       ├───armeabi-v7a
│   │   │       │   ├───chaquopy
│   │   │       │   │   └───lib
│   │   │       │   ├───cv2
│   │   │       │   └───numpy
│   │   │       │       ├───core
│   │   │       │       │   ├───include
│   │   │       │       │   │   └───numpy
│   │   │       │       │   └───lib
│   │   │       │       ├───distutils
│   │   │       │       ├───fft
│   │   │       │       ├───linalg
│   │   │       │       └───random
│   │   │       ├───common
│   │   │       │   ├───chaquopy_libcxx-10000.dist-info
│   │   │       │   ├───chaquopy_libgfortran-4.9.dist-info
│   │   │       │   ├───chaquopy_libjpeg-1.5.3.dist-info
│   │   │       │   ├───chaquopy_libpng-1.6.34.dist-info
│   │   │       │   ├───chaquopy_openblas-0.2.20.dist-info
│   │   │       │   ├───cv2
│   │   │       │   │   └───data
│   │   │       │   ├───numpy
│   │   │       │   │   ├───compat
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───core
│   │   │       │   │   │   ├───include
│   │   │       │   │   │   │   └───numpy
│   │   │       │   │   │   │       └───random
│   │   │       │   │   │   ├───lib
│   │   │       │   │   │   │   └───npy-pkg-config
│   │   │       │   │   │   └───tests
│   │   │       │   │   │       └───data
│   │   │       │   │   ├───distutils
│   │   │       │   │   │   ├───command
│   │   │       │   │   │   ├───fcompiler
│   │   │       │   │   │   ├───mingw
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───doc
│   │   │       │   │   ├───f2py
│   │   │       │   │   │   ├───src
│   │   │       │   │   │   └───tests
│   │   │       │   │   │       └───src
│   │   │       │   │   │           ├───array_from_pyobj
│   │   │       │   │   │           ├───assumed_shape
│   │   │       │   │   │           ├───common
│   │   │       │   │   │           ├───kind
│   │   │       │   │   │           ├───mixed
│   │   │       │   │   │           ├───parameter
│   │   │       │   │   │           ├───regression
│   │   │       │   │   │           ├───size
│   │   │       │   │   │           └───string
│   │   │       │   │   ├───fft
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───lib
│   │   │       │   │   │   └───tests
│   │   │       │   │   │       └───data
│   │   │       │   │   ├───linalg
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───ma
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───matrixlib
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───polynomial
│   │   │       │   │   │   └───tests
│   │   │       │   │   ├───random
│   │   │       │   │   │   └───tests
│   │   │       │   │   │       └───data
│   │   │       │   │   ├───testing
│   │   │       │   │   │   ├───tests
│   │   │       │   │   │   └───_private
│   │   │       │   │   └───tests
│   │   │       │   ├───numpy-1.17.4.dist-info
│   │   │       │   └───opencv_contrib_python_headless-4.5.1.48.dist-info
│   │   │       ├───x86
│   │   │       │   ├───chaquopy
│   │   │       │   │   └───lib
│   │   │       │   ├───cv2
│   │   │       │   └───numpy
│   │   │       │       ├───core
│   │   │       │       │   ├───include
│   │   │       │       │   │   └───numpy
│   │   │       │       │   └───lib
│   │   │       │       ├───distutils
│   │   │       │       ├───fft
│   │   │       │       ├───linalg
│   │   │       │       └───random
│   │   │       └───x86_64
│   │   │           ├───chaquopy
│   │   │           │   └───lib
│   │   │           ├───cv2
│   │   │           └───numpy
│   │   │               ├───core
│   │   │               │   ├───include
│   │   │               │   │   └───numpy
│   │   │               │   └───lib
│   │   │               ├───distutils
│   │   │               ├───fft
│   │   │               ├───linalg
│   │   │               └───random
│   │   └───tmp
│   │       ├───compileDebugJavaWithJavac
│   │       └───expandedArchives
│   │           ├───target-3.8.6-0-arm64-v8a.zip_9523e6d1aebfde9890bb48eca80830aa
│   │           │   └───jniLibs
│   │           │       └───arm64-v8a
│   │           ├───target-3.8.6-0-armeabi-v7a.zip_804be5735202c0e2db04f1a1d898f0cb
│   │           │   └───jniLibs
│   │           │       └───armeabi-v7a
│   │           ├───target-3.8.6-0-x86.zip_1f2b45829cb0922bbff96edb0c50fc2d
│   │           │   └───jniLibs
│   │           │       └───x86
│   │           └───target-3.8.6-0-x86_64.zip_21b044a0318487807c843dc1d6bf4877
│   │               └───jniLibs
│   │                   └───x86_64
│   └───src
│       ├───androidTest
│       │   └───java
│       │       └───com
│       │           └───elevenzon
│       │               └───image
│       ├───main
│       │   ├───java
│       │   │   └───com
│       │   │       └───elevenzon
│       │   │           └───image
│       │   ├───python
│       │   └───res
│       │       ├───drawable
│       │       ├───drawable-anydpi
│       │       ├───drawable-anydpi-v24
│       │       ├───drawable-hdpi
│       │       ├───drawable-mdpi
│       │       ├───drawable-v24
│       │       ├───drawable-xhdpi
│       │       ├───drawable-xxhdpi
│       │       ├───layout
│       │       ├───mipmap-anydpi-v26
│       │       ├───mipmap-hdpi
│       │       ├───mipmap-mdpi
│       │       ├───mipmap-xhdpi
│       │       ├───mipmap-xxhdpi
│       │       ├───mipmap-xxxhdpi
│       │       ├───navigation
│       │       ├───values
│       │       └───xml
│       └───test
│           └───java
│               └───com
│                   └───elevenzon
│                       └───image
└───gradle
    └───wrapper
            

```
### Contact us on

* jks.suphavadee@gmail.com  
* nuthathaina@gmail.com
