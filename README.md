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

### Directory Tree
```

QuestionnairAnalysis:.
|   .gitignore
|   build.gradle
|   gradle.properties
|   gradlew
|   gradlew.bat
|   local.properties
|   README.md
|   settings.gradle
|   
+---.gradle
|   +---6.5
|   |   |   gc.properties
|   |   |   
|   |   +---executionHistory
|   |   |       executionHistory.bin
|   |   |       executionHistory.lock
|   |   |       
|   |   +---fileChanges
|   |   |       last-build.bin
|   |   |       
|   |   +---fileContent
|   |   |       fileContent.lock
|   |   |       
|   |   +---fileHashes
|   |   |       fileHashes.bin
|   |   |       fileHashes.lock
|   |   |       resourceHashesCache.bin
|   |   |       
|   |   +---javaCompile
|   |   |       classAnalysis.bin
|   |   |       jarAnalysis.bin
|   |   |       javaCompile.lock
|   |   |       taskHistory.bin
|   |   |       
|   |   \---vcsMetadata-1
|   +---buildOutputCleanup
|   |       buildOutputCleanup.lock
|   |       cache.properties
|   |       outputFiles.bin
|   |       
|   +---checksums
|   |       checksums.lock
|   |       md5-checksums.bin
|   |       sha1-checksums.bin
|   |       
|   \---vcs-1
|           gc.properties
|           
+---.idea
|   |   .gitignore
|   |   .name
|   |   assetWizardSettings.xml
|   |   compiler.xml
|   |   gradle.xml
|   |   jarRepositories.xml
|   |   misc.xml
|   |   modules.xml
|   |   navEditor.xml
|   |   runConfigurations.xml
|   |   vcs.xml
|   |   workspace.xml
|   |   
|   +---caches
|   |       build_file_checksums.ser
|   |       
|   +---codeStyles
|   |       Project.xml
|   |       
|   +---libraries
|   |       Gradle__android_arch_core_common_1_1_1.xml
|   |       Gradle__android_arch_core_runtime_1_1_1_aar.xml
|   |       Gradle__android_arch_lifecycle_common_1_1_1.xml
|   |       Gradle__android_arch_lifecycle_livedata_1_1_1_aar.xml
|   |       Gradle__android_arch_lifecycle_livedata_core_1_1_1_aar.xml
|   |       Gradle__android_arch_lifecycle_runtime_1_1_1_aar.xml
|   |       Gradle__android_arch_lifecycle_viewmodel_1_1_1_aar.xml
|   |       Gradle__android_arch_navigation_navigation_common_1_0_0_aar.xml
|   |       Gradle__android_arch_navigation_navigation_fragment_1_0_0_aar.xml
|   |       Gradle__android_arch_navigation_navigation_runtime_1_0_0_aar.xml
|   |       Gradle__android_arch_navigation_navigation_ui_1_0_0_aar.xml
|   |       Gradle__com_android_support_animated_vector_drawable_28_0_0_aar.xml
|   |       Gradle__com_android_support_appcompat_v7_28_0_0_aar.xml
|   |       Gradle__com_android_support_asynclayoutinflater_28_0_0_aar.xml
|   |       Gradle__com_android_support_cardview_v7_28_0_0_aar.xml
|   |       Gradle__com_android_support_collections_28_0_0.xml
|   |       Gradle__com_android_support_constraint_constraint_layout_1_1_3_aar.xml
|   |       Gradle__com_android_support_constraint_constraint_layout_solver_1_1_3.xml
|   |       Gradle__com_android_support_coordinatorlayout_28_0_0_aar.xml
|   |       Gradle__com_android_support_cursoradapter_28_0_0_aar.xml
|   |       Gradle__com_android_support_customview_28_0_0_aar.xml
|   |       Gradle__com_android_support_design_28_0_0_aar.xml
|   |       Gradle__com_android_support_documentfile_28_0_0_aar.xml
|   |       Gradle__com_android_support_drawerlayout_28_0_0_aar.xml
|   |       Gradle__com_android_support_interpolator_28_0_0_aar.xml
|   |       Gradle__com_android_support_loader_28_0_0_aar.xml
|   |       Gradle__com_android_support_localbroadcastmanager_28_0_0_aar.xml
|   |       Gradle__com_android_support_print_28_0_0_aar.xml
|   |       Gradle__com_android_support_recyclerview_v7_28_0_0_aar.xml
|   |       Gradle__com_android_support_slidingpanelayout_28_0_0_aar.xml
|   |       Gradle__com_android_support_support_annotations_28_0_0.xml
|   |       Gradle__com_android_support_support_compat_28_0_0_aar.xml
|   |       Gradle__com_android_support_support_core_ui_28_0_0_aar.xml
|   |       Gradle__com_android_support_support_core_utils_28_0_0_aar.xml
|   |       Gradle__com_android_support_support_fragment_28_0_0_aar.xml
|   |       Gradle__com_android_support_support_vector_drawable_28_0_0_aar.xml
|   |       Gradle__com_android_support_swiperefreshlayout_28_0_0_aar.xml
|   |       Gradle__com_android_support_test_espresso_espresso_core_3_0_2_aar.xml
|   |       Gradle__com_android_support_test_espresso_espresso_idling_resource_3_0_2_aar.xml
|   |       Gradle__com_android_support_test_monitor_1_0_2_aar.xml
|   |       Gradle__com_android_support_test_runner_1_0_2_aar.xml
|   |       Gradle__com_android_support_transition_28_0_0_aar.xml
|   |       Gradle__com_android_support_versionedparcelable_28_0_0_aar.xml
|   |       Gradle__com_android_support_viewpager_28_0_0_aar.xml
|   |       Gradle__com_github_bumptech_glide_annotations_4_9_0.xml
|   |       Gradle__com_github_bumptech_glide_disklrucache_4_9_0.xml
|   |       Gradle__com_github_bumptech_glide_gifdecoder_4_9_0_aar.xml
|   |       Gradle__com_github_bumptech_glide_glide_4_9_0_aar.xml
|   |       Gradle__com_github_PhilJay_MPAndroidChart_Realm_v3_0_3_aar.xml
|   |       Gradle__com_github_PhilJay_MPAndroidChart_v3_0_3.xml
|   |       Gradle__com_google_code_findbugs_jsr305_2_0_1.xml
|   |       Gradle__com_squareup_javawriter_2_1_1.xml
|   |       Gradle__C__Users_kitsa__gradle_caches_modules_2_files_2_1_com_chaquo_python_runtime_chaquopy_java_9_1_0_3ce389fd29a40b6a788df30a5d6a8e3562a7b18b_chaquopy_java_9_1_0_jar.xml
|   |       Gradle__javax_inject_javax_inject_1.xml
|   |       Gradle__junit_junit_4_12.xml
|   |       Gradle__net_sf_kxml_kxml2_2_3_0.xml
|   |       Gradle__org_hamcrest_hamcrest_core_1_3.xml
|   |       Gradle__org_hamcrest_hamcrest_integration_1_3.xml
|   |       Gradle__org_hamcrest_hamcrest_library_1_3.xml
|   |       
|   \---modules
|       |   Image.iml
|       |   
|       \---app
|               Image.app.iml
|               
+---app
|   |   .gitignore
|   |   build.gradle
|   |   proguard-rules.pro
|   |   
|   +---build
|   |   +---generated
|   |   |   +---ap_generated_sources
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---not_namespaced_r_class_sources
|   |   |   |   \---debug
|   |   |   |       \---r
|   |   |   |           +---android
|   |   |   |           |   +---arch
|   |   |   |           |   |   +---core
|   |   |   |           |   |   |       R.java
|   |   |   |           |   |   |       
|   |   |   |           |   |   \---lifecycle
|   |   |   |           |   |       |   R.java
|   |   |   |           |   |       |   
|   |   |   |           |   |       +---livedata
|   |   |   |           |   |       |   |   R.java
|   |   |   |           |   |       |   |   
|   |   |   |           |   |       |   \---core
|   |   |   |           |   |       |           R.java
|   |   |   |           |   |       |           
|   |   |   |           |   |       \---viewmodel
|   |   |   |           |   |               R.java
|   |   |   |           |   |               
|   |   |   |           |   \---support
|   |   |   |           |       +---asynclayoutinflater
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---compat
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---constraint
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---coordinatorlayout
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---coreui
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---coreutils
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---cursoradapter
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---customview
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---design
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---documentfile
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---drawerlayout
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---fragment
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---graphics
|   |   |   |           |       |   \---drawable
|   |   |   |           |       |           R.java
|   |   |   |           |       |           
|   |   |   |           |       +---interpolator
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---loader
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---localbroadcastmanager
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---print
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---slidingpanelayout
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---swiperefreshlayout
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       +---transition
|   |   |   |           |       |       R.java
|   |   |   |           |       |       
|   |   |   |           |       \---v7
|   |   |   |           |           +---appcompat
|   |   |   |           |           |       R.java
|   |   |   |           |           |       
|   |   |   |           |           +---cardview
|   |   |   |           |           |       R.java
|   |   |   |           |           |       
|   |   |   |           |           +---recyclerview
|   |   |   |           |           |       R.java
|   |   |   |           |           |       
|   |   |   |           |           \---viewpager
|   |   |   |           |                   R.java
|   |   |   |           |                   
|   |   |   |           +---androidx
|   |   |   |           |   \---versionedparcelable
|   |   |   |           |           R.java
|   |   |   |           |           
|   |   |   |           \---com
|   |   |   |               +---bumptech
|   |   |   |               |   \---glide
|   |   |   |               |       |   R.java
|   |   |   |               |       |   
|   |   |   |               |       \---gifdecoder
|   |   |   |               |               R.java
|   |   |   |               |               
|   |   |   |               \---elevenzon
|   |   |   |                   \---image
|   |   |   |                           R.java
|   |   |   |                           
|   |   |   +---python
|   |   |   |   |   bp.zip
|   |   |   |   |   proguard-rules.pro
|   |   |   |   |   
|   |   |   |   +---assets
|   |   |   |   |   \---debug
|   |   |   |   |       +---app
|   |   |   |   |       |   \---chaquopy
|   |   |   |   |       |           app.imy
|   |   |   |   |       |           
|   |   |   |   |       +---build
|   |   |   |   |       |   \---chaquopy
|   |   |   |   |       |           build.json
|   |   |   |   |       |           
|   |   |   |   |       +---license
|   |   |   |   |       |   \---chaquopy
|   |   |   |   |       |           ticket.txt
|   |   |   |   |       |           
|   |   |   |   |       +---misc
|   |   |   |   |       |   \---chaquopy
|   |   |   |   |       |       |   bootstrap.imy
|   |   |   |   |       |       |   cacert.pem
|   |   |   |   |       |       |   stdlib-arm64-v8a.imy
|   |   |   |   |       |       |   stdlib-armeabi-v7a.imy
|   |   |   |   |       |       |   stdlib-common.imy
|   |   |   |   |       |       |   stdlib-x86.imy
|   |   |   |   |       |       |   stdlib-x86_64.imy
|   |   |   |   |       |       |   
|   |   |   |   |       |       \---bootstrap-native
|   |   |   |   |       |           +---arm64-v8a
|   |   |   |   |       |           |   |   binascii.so
|   |   |   |   |       |           |   |   math.so
|   |   |   |   |       |           |   |   mmap.so
|   |   |   |   |       |           |   |   zlib.so
|   |   |   |   |       |           |   |   _csv.so
|   |   |   |   |       |           |   |   _ctypes.so
|   |   |   |   |       |           |   |   _datetime.so
|   |   |   |   |       |           |   |   _hashlib.so
|   |   |   |   |       |           |   |   _json.so
|   |   |   |   |       |           |   |   _random.so
|   |   |   |   |       |           |   |   _struct.so
|   |   |   |   |       |           |   |   
|   |   |   |   |       |           |   \---java
|   |   |   |   |       |           |           chaquopy.so
|   |   |   |   |       |           |           chaquopy_android.so
|   |   |   |   |       |           |           __init__.py
|   |   |   |   |       |           |           
|   |   |   |   |       |           +---armeabi-v7a
|   |   |   |   |       |           |   |   binascii.so
|   |   |   |   |       |           |   |   math.so
|   |   |   |   |       |           |   |   mmap.so
|   |   |   |   |       |           |   |   zlib.so
|   |   |   |   |       |           |   |   _csv.so
|   |   |   |   |       |           |   |   _ctypes.so
|   |   |   |   |       |           |   |   _datetime.so
|   |   |   |   |       |           |   |   _hashlib.so
|   |   |   |   |       |           |   |   _json.so
|   |   |   |   |       |           |   |   _random.so
|   |   |   |   |       |           |   |   _struct.so
|   |   |   |   |       |           |   |   
|   |   |   |   |       |           |   \---java
|   |   |   |   |       |           |           chaquopy.so
|   |   |   |   |       |           |           chaquopy_android.so
|   |   |   |   |       |           |           __init__.py
|   |   |   |   |       |           |           
|   |   |   |   |       |           +---x86
|   |   |   |   |       |           |   |   binascii.so
|   |   |   |   |       |           |   |   math.so
|   |   |   |   |       |           |   |   mmap.so
|   |   |   |   |       |           |   |   zlib.so
|   |   |   |   |       |           |   |   _csv.so
|   |   |   |   |       |           |   |   _ctypes.so
|   |   |   |   |       |           |   |   _datetime.so
|   |   |   |   |       |           |   |   _hashlib.so
|   |   |   |   |       |           |   |   _json.so
|   |   |   |   |       |           |   |   _random.so
|   |   |   |   |       |           |   |   _struct.so
|   |   |   |   |       |           |   |   
|   |   |   |   |       |           |   \---java
|   |   |   |   |       |           |           chaquopy.so
|   |   |   |   |       |           |           chaquopy_android.so
|   |   |   |   |       |           |           __init__.py
|   |   |   |   |       |           |           
|   |   |   |   |       |           \---x86_64
|   |   |   |   |       |               |   binascii.so
|   |   |   |   |       |               |   math.so
|   |   |   |   |       |               |   mmap.so
|   |   |   |   |       |               |   zlib.so
|   |   |   |   |       |               |   _csv.so
|   |   |   |   |       |               |   _ctypes.so
|   |   |   |   |       |               |   _datetime.so
|   |   |   |   |       |               |   _hashlib.so
|   |   |   |   |       |               |   _json.so
|   |   |   |   |       |               |   _random.so
|   |   |   |   |       |               |   _struct.so
|   |   |   |   |       |               |   
|   |   |   |   |       |               \---java
|   |   |   |   |       |                       chaquopy.so
|   |   |   |   |       |                       chaquopy_android.so
|   |   |   |   |       |                       __init__.py
|   |   |   |   |       |                       
|   |   |   |   |       \---requirements
|   |   |   |   |           \---chaquopy
|   |   |   |   |                   requirements-arm64-v8a.imy
|   |   |   |   |                   requirements-armeabi-v7a.imy
|   |   |   |   |                   requirements-common.imy
|   |   |   |   |                   requirements-x86.imy
|   |   |   |   |                   requirements-x86_64.imy
|   |   |   |   |                   
|   |   |   |   +---jniLibs
|   |   |   |   |   \---debug
|   |   |   |   |       +---arm64-v8a
|   |   |   |   |       |       libchaquopy_java.so
|   |   |   |   |       |       libcrypto_chaquopy.so
|   |   |   |   |       |       libpython3.8.so
|   |   |   |   |       |       libsqlite3_chaquopy.so
|   |   |   |   |       |       libssl_chaquopy.so
|   |   |   |   |       |       
|   |   |   |   |       +---armeabi-v7a
|   |   |   |   |       |       libchaquopy_java.so
|   |   |   |   |       |       libcrypto_chaquopy.so
|   |   |   |   |       |       libpython3.8.so
|   |   |   |   |       |       libsqlite3_chaquopy.so
|   |   |   |   |       |       libssl_chaquopy.so
|   |   |   |   |       |       
|   |   |   |   |       +---x86
|   |   |   |   |       |       libchaquopy_java.so
|   |   |   |   |       |       libcrypto_chaquopy.so
|   |   |   |   |       |       libpython3.8.so
|   |   |   |   |       |       libsqlite3_chaquopy.so
|   |   |   |   |       |       libssl_chaquopy.so
|   |   |   |   |       |       
|   |   |   |   |       \---x86_64
|   |   |   |   |               libchaquopy_java.so
|   |   |   |   |               libcrypto_chaquopy.so
|   |   |   |   |               libpython3.8.so
|   |   |   |   |               libsqlite3_chaquopy.so
|   |   |   |   |               libssl_chaquopy.so
|   |   |   |   |               
|   |   |   |   +---pip
|   |   |   |   |   \---_vendor
|   |   |   |   |       \---certifi
|   |   |   |   |               cacert.pem
|   |   |   |   |               
|   |   |   |   +---proxies
|   |   |   |   |   \---debug
|   |   |   |   \---sources
|   |   |   |       \---debug
|   |   |   |               checkbox.py
|   |   |   |               table.py
|   |   |   |               
|   |   |   +---res
|   |   |   |   +---pngs
|   |   |   |   |   \---debug
|   |   |   |   |       +---drawable-anydpi-v21
|   |   |   |   |       |       ic_action_name.xml
|   |   |   |   |       |       ic_arrow_back_white_24dp.xml
|   |   |   |   |       |       ic_camera.xml
|   |   |   |   |       |       ic_camera_white_30dp.xml
|   |   |   |   |       |       ic_checkbox.xml
|   |   |   |   |       |       ic_checked.xml
|   |   |   |   |       |       ic_click.xml
|   |   |   |   |       |       ic_doc.xml
|   |   |   |   |       |       ic_document.xml
|   |   |   |   |       |       ic_export.xml
|   |   |   |   |       |       ic_folder_white_30dp.xml
|   |   |   |   |       |       ic_graph.xml
|   |   |   |   |       |       ic_home.xml
|   |   |   |   |       |       ic_launcher_background.xml
|   |   |   |   |       |       ic_next.xml
|   |   |   |   |       |       ic_previous.xml
|   |   |   |   |       |       ic_send_white_20dp.xml
|   |   |   |   |       |       ic_stat_name.xml
|   |   |   |   |       |       ic_submit.xml
|   |   |   |   |       |       ic_table.xml
|   |   |   |   |       |       ic_unchecked.xml
|   |   |   |   |       |       ic_view.xml
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-anydpi-v24
|   |   |   |   |       |       ic_add.xml
|   |   |   |   |       |       ic_close.xml
|   |   |   |   |       |       ic_launcher_foreground.xml
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-hdpi
|   |   |   |   |       |       ic_arrow_back_white_24dp.png
|   |   |   |   |       |       ic_camera.png
|   |   |   |   |       |       ic_camera_white_30dp.png
|   |   |   |   |       |       ic_checkbox.png
|   |   |   |   |       |       ic_checked.png
|   |   |   |   |       |       ic_click.png
|   |   |   |   |       |       ic_doc.png
|   |   |   |   |       |       ic_document.png
|   |   |   |   |       |       ic_export.png
|   |   |   |   |       |       ic_folder_white_30dp.png
|   |   |   |   |       |       ic_graph.png
|   |   |   |   |       |       ic_home.png
|   |   |   |   |       |       ic_launcher_background.png
|   |   |   |   |       |       ic_next.png
|   |   |   |   |       |       ic_previous.png
|   |   |   |   |       |       ic_send_white_20dp.png
|   |   |   |   |       |       ic_submit.png
|   |   |   |   |       |       ic_table.png
|   |   |   |   |       |       ic_unchecked.png
|   |   |   |   |       |       ic_view.png
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-ldpi
|   |   |   |   |       |       ic_action_name.png
|   |   |   |   |       |       ic_arrow_back_white_24dp.png
|   |   |   |   |       |       ic_camera.png
|   |   |   |   |       |       ic_camera_white_30dp.png
|   |   |   |   |       |       ic_checkbox.png
|   |   |   |   |       |       ic_checked.png
|   |   |   |   |       |       ic_click.png
|   |   |   |   |       |       ic_doc.png
|   |   |   |   |       |       ic_document.png
|   |   |   |   |       |       ic_export.png
|   |   |   |   |       |       ic_folder_white_30dp.png
|   |   |   |   |       |       ic_graph.png
|   |   |   |   |       |       ic_home.png
|   |   |   |   |       |       ic_launcher_background.png
|   |   |   |   |       |       ic_next.png
|   |   |   |   |       |       ic_previous.png
|   |   |   |   |       |       ic_send_white_20dp.png
|   |   |   |   |       |       ic_stat_name.png
|   |   |   |   |       |       ic_submit.png
|   |   |   |   |       |       ic_table.png
|   |   |   |   |       |       ic_unchecked.png
|   |   |   |   |       |       ic_view.png
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-mdpi
|   |   |   |   |       |       ic_arrow_back_white_24dp.png
|   |   |   |   |       |       ic_camera.png
|   |   |   |   |       |       ic_camera_white_30dp.png
|   |   |   |   |       |       ic_checkbox.png
|   |   |   |   |       |       ic_checked.png
|   |   |   |   |       |       ic_click.png
|   |   |   |   |       |       ic_doc.png
|   |   |   |   |       |       ic_document.png
|   |   |   |   |       |       ic_export.png
|   |   |   |   |       |       ic_folder_white_30dp.png
|   |   |   |   |       |       ic_graph.png
|   |   |   |   |       |       ic_home.png
|   |   |   |   |       |       ic_launcher_background.png
|   |   |   |   |       |       ic_next.png
|   |   |   |   |       |       ic_previous.png
|   |   |   |   |       |       ic_send_white_20dp.png
|   |   |   |   |       |       ic_submit.png
|   |   |   |   |       |       ic_table.png
|   |   |   |   |       |       ic_unchecked.png
|   |   |   |   |       |       ic_view.png
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-xhdpi
|   |   |   |   |       |       ic_arrow_back_white_24dp.png
|   |   |   |   |       |       ic_camera.png
|   |   |   |   |       |       ic_camera_white_30dp.png
|   |   |   |   |       |       ic_checkbox.png
|   |   |   |   |       |       ic_checked.png
|   |   |   |   |       |       ic_click.png
|   |   |   |   |       |       ic_doc.png
|   |   |   |   |       |       ic_document.png
|   |   |   |   |       |       ic_export.png
|   |   |   |   |       |       ic_folder_white_30dp.png
|   |   |   |   |       |       ic_graph.png
|   |   |   |   |       |       ic_home.png
|   |   |   |   |       |       ic_launcher_background.png
|   |   |   |   |       |       ic_next.png
|   |   |   |   |       |       ic_previous.png
|   |   |   |   |       |       ic_send_white_20dp.png
|   |   |   |   |       |       ic_submit.png
|   |   |   |   |       |       ic_table.png
|   |   |   |   |       |       ic_unchecked.png
|   |   |   |   |       |       ic_view.png
|   |   |   |   |       |       
|   |   |   |   |       +---drawable-xxhdpi
|   |   |   |   |       |       ic_arrow_back_white_24dp.png
|   |   |   |   |       |       ic_camera.png
|   |   |   |   |       |       ic_camera_white_30dp.png
|   |   |   |   |       |       ic_checkbox.png
|   |   |   |   |       |       ic_checked.png
|   |   |   |   |       |       ic_click.png
|   |   |   |   |       |       ic_doc.png
|   |   |   |   |       |       ic_document.png
|   |   |   |   |       |       ic_export.png
|   |   |   |   |       |       ic_folder_white_30dp.png
|   |   |   |   |       |       ic_graph.png
|   |   |   |   |       |       ic_home.png
|   |   |   |   |       |       ic_launcher_background.png
|   |   |   |   |       |       ic_next.png
|   |   |   |   |       |       ic_previous.png
|   |   |   |   |       |       ic_send_white_20dp.png
|   |   |   |   |       |       ic_submit.png
|   |   |   |   |       |       ic_table.png
|   |   |   |   |       |       ic_unchecked.png
|   |   |   |   |       |       ic_view.png
|   |   |   |   |       |       
|   |   |   |   |       \---drawable-xxxhdpi
|   |   |   |   |               ic_action_name.png
|   |   |   |   |               ic_arrow_back_white_24dp.png
|   |   |   |   |               ic_camera.png
|   |   |   |   |               ic_camera_white_30dp.png
|   |   |   |   |               ic_checkbox.png
|   |   |   |   |               ic_checked.png
|   |   |   |   |               ic_click.png
|   |   |   |   |               ic_doc.png
|   |   |   |   |               ic_document.png
|   |   |   |   |               ic_export.png
|   |   |   |   |               ic_folder_white_30dp.png
|   |   |   |   |               ic_graph.png
|   |   |   |   |               ic_home.png
|   |   |   |   |               ic_launcher_background.png
|   |   |   |   |               ic_next.png
|   |   |   |   |               ic_previous.png
|   |   |   |   |               ic_send_white_20dp.png
|   |   |   |   |               ic_stat_name.png
|   |   |   |   |               ic_submit.png
|   |   |   |   |               ic_table.png
|   |   |   |   |               ic_unchecked.png
|   |   |   |   |               ic_view.png
|   |   |   |   |               
|   |   |   |   \---resValues
|   |   |   |       \---debug
|   |   |   \---source
|   |   |       \---buildConfig
|   |   |           \---debug
|   |   |               \---com
|   |   |                   \---elevenzon
|   |   |                       \---image
|   |   |                               BuildConfig.java
|   |   |                               
|   |   +---intermediates
|   |   |   +---aar_metadata_check
|   |   |   |   \---debug
|   |   |   +---annotation_processor_list
|   |   |   |   \---debug
|   |   |   |           annotationProcessors.json
|   |   |   |           
|   |   |   +---apk_list
|   |   |   |   \---debug
|   |   |   |       \---mainApkListPersistenceDebug
|   |   |   |               apk-list.gson
|   |   |   |               
|   |   |   +---blame
|   |   |   |   \---res
|   |   |   |       \---debug
|   |   |   |           +---multi-v2
|   |   |   |           |       debug.json
|   |   |   |           |       values-af.json
|   |   |   |           |       values-am.json
|   |   |   |           |       values-ar.json
|   |   |   |           |       values-as.json
|   |   |   |           |       values-az.json
|   |   |   |           |       values-b+sr+Latn.json
|   |   |   |           |       values-be.json
|   |   |   |           |       values-bg.json
|   |   |   |           |       values-bn.json
|   |   |   |           |       values-bs.json
|   |   |   |           |       values-ca.json
|   |   |   |           |       values-cs.json
|   |   |   |           |       values-da.json
|   |   |   |           |       values-de.json
|   |   |   |           |       values-el.json
|   |   |   |           |       values-en-rAU.json
|   |   |   |           |       values-en-rCA.json
|   |   |   |           |       values-en-rGB.json
|   |   |   |           |       values-en-rIN.json
|   |   |   |           |       values-en-rXC.json
|   |   |   |           |       values-es-rUS.json
|   |   |   |           |       values-es.json
|   |   |   |           |       values-et.json
|   |   |   |           |       values-eu.json
|   |   |   |           |       values-fa.json
|   |   |   |           |       values-fi.json
|   |   |   |           |       values-fr-rCA.json
|   |   |   |           |       values-fr.json
|   |   |   |           |       values-gl.json
|   |   |   |           |       values-gu.json
|   |   |   |           |       values-h720dp-v13.json
|   |   |   |           |       values-hdpi-v4.json
|   |   |   |           |       values-hi.json
|   |   |   |           |       values-hr.json
|   |   |   |           |       values-hu.json
|   |   |   |           |       values-hy.json
|   |   |   |           |       values-in.json
|   |   |   |           |       values-is.json
|   |   |   |           |       values-it.json
|   |   |   |           |       values-iw.json
|   |   |   |           |       values-ja.json
|   |   |   |           |       values-ka.json
|   |   |   |           |       values-kk.json
|   |   |   |           |       values-km.json
|   |   |   |           |       values-kn.json
|   |   |   |           |       values-ko.json
|   |   |   |           |       values-ky.json
|   |   |   |           |       values-land.json
|   |   |   |           |       values-large-v4.json
|   |   |   |           |       values-ldltr-v21.json
|   |   |   |           |       values-lo.json
|   |   |   |           |       values-lt.json
|   |   |   |           |       values-lv.json
|   |   |   |           |       values-mk.json
|   |   |   |           |       values-ml.json
|   |   |   |           |       values-mn.json
|   |   |   |           |       values-mr.json
|   |   |   |           |       values-ms.json
|   |   |   |           |       values-my.json
|   |   |   |           |       values-nb.json
|   |   |   |           |       values-ne.json
|   |   |   |           |       values-night-v8.json
|   |   |   |           |       values-nl.json
|   |   |   |           |       values-or.json
|   |   |   |           |       values-pa.json
|   |   |   |           |       values-pl.json
|   |   |   |           |       values-port.json
|   |   |   |           |       values-pt-rBR.json
|   |   |   |           |       values-pt-rPT.json
|   |   |   |           |       values-pt.json
|   |   |   |           |       values-ro.json
|   |   |   |           |       values-ru.json
|   |   |   |           |       values-si.json
|   |   |   |           |       values-sk.json
|   |   |   |           |       values-sl.json
|   |   |   |           |       values-sq.json
|   |   |   |           |       values-sr.json
|   |   |   |           |       values-sv.json
|   |   |   |           |       values-sw.json
|   |   |   |           |       values-sw600dp-v13.json
|   |   |   |           |       values-ta.json
|   |   |   |           |       values-te.json
|   |   |   |           |       values-th.json
|   |   |   |           |       values-tl.json
|   |   |   |           |       values-tr.json
|   |   |   |           |       values-uk.json
|   |   |   |           |       values-ur.json
|   |   |   |           |       values-uz.json
|   |   |   |           |       values-v16.json
|   |   |   |           |       values-v17.json
|   |   |   |           |       values-v18.json
|   |   |   |           |       values-v21.json
|   |   |   |           |       values-v22.json
|   |   |   |           |       values-v23.json
|   |   |   |           |       values-v24.json
|   |   |   |           |       values-v25.json
|   |   |   |           |       values-v26.json
|   |   |   |           |       values-v28.json
|   |   |   |           |       values-vi.json
|   |   |   |           |       values-watch-v20.json
|   |   |   |           |       values-watch-v21.json
|   |   |   |           |       values-xlarge-v4.json
|   |   |   |           |       values-zh-rCN.json
|   |   |   |           |       values-zh-rHK.json
|   |   |   |           |       values-zh-rTW.json
|   |   |   |           |       values-zu.json
|   |   |   |           |       values.json
|   |   |   |           |       
|   |   |   |           \---single
|   |   |   |                   debug.json
|   |   |   |                   
|   |   |   +---bundle_manifest
|   |   |   |   \---debug
|   |   |   |       +---bundle-manifest
|   |   |   |       |       AndroidManifest.xml
|   |   |   |       |       output.json
|   |   |   |       |       
|   |   |   |       \---processDebugManifest
|   |   |   |           \---bundle-manifest
|   |   |   |                   AndroidManifest.xml
|   |   |   |                   output.json
|   |   |   |                   
|   |   |   +---check_manifest_result
|   |   |   |   \---debug
|   |   |   |       \---checkDebugManifest
|   |   |   |           \---out
|   |   |   +---compatible_screen_manifest
|   |   |   |   \---debug
|   |   |   |           output-metadata.json
|   |   |   |           
|   |   |   +---compile_and_runtime_not_namespaced_r_class_jar
|   |   |   |   \---debug
|   |   |   |           R.jar
|   |   |   |           
|   |   |   +---compressed_assets
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           \---assets
|   |   |   |               \---chaquopy
|   |   |   |                   |   app.imy.jar
|   |   |   |                   |   bootstrap.imy.jar
|   |   |   |                   |   build.json.jar
|   |   |   |                   |   cacert.pem.jar
|   |   |   |                   |   requirements-arm64-v8a.imy.jar
|   |   |   |                   |   requirements-armeabi-v7a.imy.jar
|   |   |   |                   |   requirements-common.imy.jar
|   |   |   |                   |   requirements-x86.imy.jar
|   |   |   |                   |   requirements-x86_64.imy.jar
|   |   |   |                   |   stdlib-arm64-v8a.imy.jar
|   |   |   |                   |   stdlib-armeabi-v7a.imy.jar
|   |   |   |                   |   stdlib-common.imy.jar
|   |   |   |                   |   stdlib-x86.imy.jar
|   |   |   |                   |   stdlib-x86_64.imy.jar
|   |   |   |                   |   ticket.txt.jar
|   |   |   |                   |   
|   |   |   |                   \---bootstrap-native
|   |   |   |                       +---arm64-v8a
|   |   |   |                       |   |   binascii.so.jar
|   |   |   |                       |   |   math.so.jar
|   |   |   |                       |   |   mmap.so.jar
|   |   |   |                       |   |   zlib.so.jar
|   |   |   |                       |   |   _csv.so.jar
|   |   |   |                       |   |   _ctypes.so.jar
|   |   |   |                       |   |   _datetime.so.jar
|   |   |   |                       |   |   _hashlib.so.jar
|   |   |   |                       |   |   _json.so.jar
|   |   |   |                       |   |   _random.so.jar
|   |   |   |                       |   |   _struct.so.jar
|   |   |   |                       |   |   
|   |   |   |                       |   \---java
|   |   |   |                       |           chaquopy.so.jar
|   |   |   |                       |           chaquopy_android.so.jar
|   |   |   |                       |           __init__.py.jar
|   |   |   |                       |           
|   |   |   |                       +---armeabi-v7a
|   |   |   |                       |   |   binascii.so.jar
|   |   |   |                       |   |   math.so.jar
|   |   |   |                       |   |   mmap.so.jar
|   |   |   |                       |   |   zlib.so.jar
|   |   |   |                       |   |   _csv.so.jar
|   |   |   |                       |   |   _ctypes.so.jar
|   |   |   |                       |   |   _datetime.so.jar
|   |   |   |                       |   |   _hashlib.so.jar
|   |   |   |                       |   |   _json.so.jar
|   |   |   |                       |   |   _random.so.jar
|   |   |   |                       |   |   _struct.so.jar
|   |   |   |                       |   |   
|   |   |   |                       |   \---java
|   |   |   |                       |           chaquopy.so.jar
|   |   |   |                       |           chaquopy_android.so.jar
|   |   |   |                       |           __init__.py.jar
|   |   |   |                       |           
|   |   |   |                       +---x86
|   |   |   |                       |   |   binascii.so.jar
|   |   |   |                       |   |   math.so.jar
|   |   |   |                       |   |   mmap.so.jar
|   |   |   |                       |   |   zlib.so.jar
|   |   |   |                       |   |   _csv.so.jar
|   |   |   |                       |   |   _ctypes.so.jar
|   |   |   |                       |   |   _datetime.so.jar
|   |   |   |                       |   |   _hashlib.so.jar
|   |   |   |                       |   |   _json.so.jar
|   |   |   |                       |   |   _random.so.jar
|   |   |   |                       |   |   _struct.so.jar
|   |   |   |                       |   |   
|   |   |   |                       |   \---java
|   |   |   |                       |           chaquopy.so.jar
|   |   |   |                       |           chaquopy_android.so.jar
|   |   |   |                       |           __init__.py.jar
|   |   |   |                       |           
|   |   |   |                       \---x86_64
|   |   |   |                           |   binascii.so.jar
|   |   |   |                           |   math.so.jar
|   |   |   |                           |   mmap.so.jar
|   |   |   |                           |   zlib.so.jar
|   |   |   |                           |   _csv.so.jar
|   |   |   |                           |   _ctypes.so.jar
|   |   |   |                           |   _datetime.so.jar
|   |   |   |                           |   _hashlib.so.jar
|   |   |   |                           |   _json.so.jar
|   |   |   |                           |   _random.so.jar
|   |   |   |                           |   _struct.so.jar
|   |   |   |                           |   
|   |   |   |                           \---java
|   |   |   |                                   chaquopy.so.jar
|   |   |   |                                   chaquopy_android.so.jar
|   |   |   |                                   __init__.py.jar
|   |   |   |                                   
|   |   |   +---data_binding_layout_info_type_merge
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---dex
|   |   |   |   \---debug
|   |   |   |       \---mergeDexDebug
|   |   |   |               classes.dex
|   |   |   |               
|   |   |   +---dex_archive_input_jar_hashes
|   |   |   |   \---debug
|   |   |   |           out
|   |   |   |           
|   |   |   +---dex_number_of_buckets_file
|   |   |   |   \---debug
|   |   |   |           out
|   |   |   |           
|   |   |   +---duplicate_classes_check
|   |   |   |   \---debug
|   |   |   +---external_libs_dex
|   |   |   |   \---debug
|   |   |   |       \---mergeExtDexDebug
|   |   |   |               classes.dex
|   |   |   |               
|   |   |   +---external_libs_dex_archive
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---external_libs_dex_archive_with_artifact_transforms
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---incremental
|   |   |   |   +---debug-mergeJavaRes
|   |   |   |   |   |   merge-state
|   |   |   |   |   |   
|   |   |   |   |   \---zip-cache
|   |   |   |   |           1kEgZ_Qp+Jd46OfNWhM5BQNqzLc=
|   |   |   |   |           1KUSijc0mQiKUv7zs3OvreRenAc=
|   |   |   |   |           1zGoUaI_s9VHblITcUXGNrggteE=
|   |   |   |   |           373noRRhHn_ukNWk80PqFHvi5d4=
|   |   |   |   |           4L+E+_yVboCn5lhLE0KxtmXoutM=
|   |   |   |   |           6biKk91neXSEXkdx6t3aLApb5FM=
|   |   |   |   |           6KtJC5+PNlD9KAlTiQNk5V2xSg8=
|   |   |   |   |           7h_hvH_xQycbKv3_qFlcCmJgjUU=
|   |   |   |   |           87Kg8gY++JZQQ4xUy2EUZyk7uPk=
|   |   |   |   |           8LAdNrjF47r90nlJ1HO7Vd+zwEk=
|   |   |   |   |           8URRSG4a6LNAbGnzz952JFPMFrc=
|   |   |   |   |           awu9lUoXG9AwlmCE5i_TRiz91II=
|   |   |   |   |           CF08CKmfqXlhyYSq3G7onVDjIGM=
|   |   |   |   |           cP6WOpyRGhAU156GGsXfVIXf0MM=
|   |   |   |   |           d2vWoZPHuyuRjddwQIs5LgobEEU=
|   |   |   |   |           dCIKJD0oMRsS+HJPGs2O6TrqvMI=
|   |   |   |   |           D_1rSGudRTHXaTPICukigBFMXXc=
|   |   |   |   |           F1OCx0F0dQcPaU1KuGCpOBE9iBA=
|   |   |   |   |           f8l4j7ngR7wu1xMnOYxnfcf+KHs=
|   |   |   |   |           fNpaXOMcbELKWuejFmhzAi1n8mw=
|   |   |   |   |           GbBmsq8UGkAIQvzWRfdCe1hSOL0=
|   |   |   |   |           GmXy7sRfGaVqeJI+stBixBKBjOE=
|   |   |   |   |           gZgEu7mWaN4rnY1YbYUZkOGfQMA=
|   |   |   |   |           HPDrn9SLvoYCQvhDY6NKOcDImAk=
|   |   |   |   |           I2sIgj+wGADA4tL7eyV9GEqCh_E=
|   |   |   |   |           i8aGFvYqEPpyTGtfzlUgwsignfM=
|   |   |   |   |           IBAPvjorVdZDvWciEfgao9+qIAE=
|   |   |   |   |           iQSsB1cXMpHBYob48eXp2_kux9A=
|   |   |   |   |           kApKSEfP9uDNgSsSSBoFjOdnka8=
|   |   |   |   |           LDuCDMGCNeYPXroEK4ZwGgnfOtw=
|   |   |   |   |           LZgkXKRdXS4vv_S1d2nyp2F3mG4=
|   |   |   |   |           NmNL+fahYqNX1Jreq8iY2E489c0=
|   |   |   |   |           PyM8i6Xvsgt108jDKyt7pOX1NgI=
|   |   |   |   |           qfTQaAPN2RW0SGDADSxX68Bsmvw=
|   |   |   |   |           sw_B0GfdBynQ0cYML_6cOzR89K0=
|   |   |   |   |           TcTVyEtdAZbEO5gZHd2mIBJKNdU=
|   |   |   |   |           tLf8efZzeiHujP17qZnVOwJCGyA=
|   |   |   |   |           Vak8Pd0uNwtawgOhIQycRbuJcrc=
|   |   |   |   |           WgJOWyMl3W45RSsy0I2_K45Rqx8=
|   |   |   |   |           wT9CQRge0GNfjtBNY2iK5h3MlRM=
|   |   |   |   |           X5wnKr_oLENzS3Zb9LX8sfLAC44=
|   |   |   |   |           XB1BmC0Vve_p6DCfbGAMK1k3pwI=
|   |   |   |   |           xLpiVmTUPXAXJmQpTfD87PdPk5g=
|   |   |   |   |           y+fiMfZd+XnFwXT9WfGRLM6yZNw=
|   |   |   |   |           Yw501Q8pFk8BSihq0POPH69xnrc=
|   |   |   |   |           ZJFKYSEMD8IHePR6eyJ6jhhtXM0=
|   |   |   |   |           ZKZxjKiJwRDHwYMSh7QdkoB0qhU=
|   |   |   |   |           
|   |   |   |   +---debug-mergeNativeLibs
|   |   |   |   |   |   merge-state
|   |   |   |   |   |   
|   |   |   |   |   \---zip-cache
|   |   |   |   |           1kEgZ_Qp+Jd46OfNWhM5BQNqzLc=
|   |   |   |   |           1KUSijc0mQiKUv7zs3OvreRenAc=
|   |   |   |   |           1zGoUaI_s9VHblITcUXGNrggteE=
|   |   |   |   |           373noRRhHn_ukNWk80PqFHvi5d4=
|   |   |   |   |           4L+E+_yVboCn5lhLE0KxtmXoutM=
|   |   |   |   |           6biKk91neXSEXkdx6t3aLApb5FM=
|   |   |   |   |           6KtJC5+PNlD9KAlTiQNk5V2xSg8=
|   |   |   |   |           7h_hvH_xQycbKv3_qFlcCmJgjUU=
|   |   |   |   |           87Kg8gY++JZQQ4xUy2EUZyk7uPk=
|   |   |   |   |           8LAdNrjF47r90nlJ1HO7Vd+zwEk=
|   |   |   |   |           8URRSG4a6LNAbGnzz952JFPMFrc=
|   |   |   |   |           awu9lUoXG9AwlmCE5i_TRiz91II=
|   |   |   |   |           CF08CKmfqXlhyYSq3G7onVDjIGM=
|   |   |   |   |           cP6WOpyRGhAU156GGsXfVIXf0MM=
|   |   |   |   |           d2vWoZPHuyuRjddwQIs5LgobEEU=
|   |   |   |   |           dCIKJD0oMRsS+HJPGs2O6TrqvMI=
|   |   |   |   |           D_1rSGudRTHXaTPICukigBFMXXc=
|   |   |   |   |           F1OCx0F0dQcPaU1KuGCpOBE9iBA=
|   |   |   |   |           f8l4j7ngR7wu1xMnOYxnfcf+KHs=
|   |   |   |   |           fNpaXOMcbELKWuejFmhzAi1n8mw=
|   |   |   |   |           GbBmsq8UGkAIQvzWRfdCe1hSOL0=
|   |   |   |   |           GmXy7sRfGaVqeJI+stBixBKBjOE=
|   |   |   |   |           gZgEu7mWaN4rnY1YbYUZkOGfQMA=
|   |   |   |   |           HPDrn9SLvoYCQvhDY6NKOcDImAk=
|   |   |   |   |           I2sIgj+wGADA4tL7eyV9GEqCh_E=
|   |   |   |   |           i8aGFvYqEPpyTGtfzlUgwsignfM=
|   |   |   |   |           IBAPvjorVdZDvWciEfgao9+qIAE=
|   |   |   |   |           iQSsB1cXMpHBYob48eXp2_kux9A=
|   |   |   |   |           kApKSEfP9uDNgSsSSBoFjOdnka8=
|   |   |   |   |           LDuCDMGCNeYPXroEK4ZwGgnfOtw=
|   |   |   |   |           LZgkXKRdXS4vv_S1d2nyp2F3mG4=
|   |   |   |   |           NmNL+fahYqNX1Jreq8iY2E489c0=
|   |   |   |   |           PyM8i6Xvsgt108jDKyt7pOX1NgI=
|   |   |   |   |           qfTQaAPN2RW0SGDADSxX68Bsmvw=
|   |   |   |   |           sw_B0GfdBynQ0cYML_6cOzR89K0=
|   |   |   |   |           TcTVyEtdAZbEO5gZHd2mIBJKNdU=
|   |   |   |   |           tLf8efZzeiHujP17qZnVOwJCGyA=
|   |   |   |   |           Vak8Pd0uNwtawgOhIQycRbuJcrc=
|   |   |   |   |           WgJOWyMl3W45RSsy0I2_K45Rqx8=
|   |   |   |   |           wT9CQRge0GNfjtBNY2iK5h3MlRM=
|   |   |   |   |           X5wnKr_oLENzS3Zb9LX8sfLAC44=
|   |   |   |   |           XB1BmC0Vve_p6DCfbGAMK1k3pwI=
|   |   |   |   |           xLpiVmTUPXAXJmQpTfD87PdPk5g=
|   |   |   |   |           y+fiMfZd+XnFwXT9WfGRLM6yZNw=
|   |   |   |   |           Yw501Q8pFk8BSihq0POPH69xnrc=
|   |   |   |   |           ZJFKYSEMD8IHePR6eyJ6jhhtXM0=
|   |   |   |   |           ZKZxjKiJwRDHwYMSh7QdkoB0qhU=
|   |   |   |   |           
|   |   |   |   +---mergeDebugAssets
|   |   |   |   |       merger.xml
|   |   |   |   |       
|   |   |   |   +---mergeDebugJniLibFolders
|   |   |   |   |       merger.xml
|   |   |   |   |       
|   |   |   |   +---mergeDebugResources
|   |   |   |   |   |   compile-file-map.properties
|   |   |   |   |   |   merger.xml
|   |   |   |   |   |   
|   |   |   |   |   +---merged.dir
|   |   |   |   |   \---stripped.dir
|   |   |   |   +---mergeDebugShaders
|   |   |   |   |       merger.xml
|   |   |   |   |       
|   |   |   |   +---packageDebug
|   |   |   |   |   \---tmp
|   |   |   |   |       \---debug
|   |   |   |   |           |   dex-renamer-state.txt
|   |   |   |   |           |   
|   |   |   |   |           \---zip-cache
|   |   |   |   |                   androidResources
|   |   |   |   |                   javaResources0
|   |   |   |   |                   
|   |   |   |   \---processDebugResources
|   |   |   +---instant_app_manifest
|   |   |   |   \---debug
|   |   |   |           AndroidManifest.xml
|   |   |   |           output.json
|   |   |   |           
|   |   |   +---javac
|   |   |   |   \---debug
|   |   |   |       \---classes
|   |   |   |           \---com
|   |   |   |               \---elevenzon
|   |   |   |                   \---image
|   |   |   |                           ActivityCheckbox$1$1.class
|   |   |   |                           ActivityCheckbox$1.class
|   |   |   |                           ActivityCheckbox$2$1.class
|   |   |   |                           ActivityCheckbox$2.class
|   |   |   |                           ActivityCheckbox$3.class
|   |   |   |                           ActivityCheckbox$4.class
|   |   |   |                           ActivityCheckbox$5.class
|   |   |   |                           ActivityCheckbox$6.class
|   |   |   |                           ActivityCheckbox.class
|   |   |   |                           ActivityQuestionnaire$1.class
|   |   |   |                           ActivityQuestionnaire$2.class
|   |   |   |                           ActivityQuestionnaire.class
|   |   |   |                           ActivitySatisfication$1$1.class
|   |   |   |                           ActivitySatisfication$1.class
|   |   |   |                           ActivitySatisfication$2.class
|   |   |   |                           ActivitySatisfication$3.class
|   |   |   |                           ActivitySatisfication$4.class
|   |   |   |                           ActivitySatisfication$5.class
|   |   |   |                           ActivitySatisfication$6.class
|   |   |   |                           ActivitySatisfication.class
|   |   |   |                           BuildConfig.class
|   |   |   |                           CheckboxInfo.class
|   |   |   |                           DelayedProgressDialog$1.class
|   |   |   |                           DelayedProgressDialog$2.class
|   |   |   |                           DelayedProgressDialog$3.class
|   |   |   |                           DelayedProgressDialog.class
|   |   |   |                           Detail$1.class
|   |   |   |                           Detail$2.class
|   |   |   |                           Detail.class
|   |   |   |                           ExampleDialog$1.class
|   |   |   |                           ExampleDialog.class
|   |   |   |                           ExampleDialog2$1.class
|   |   |   |                           ExampleDialog2.class
|   |   |   |                           FirstFragment$1.class
|   |   |   |                           FirstFragment.class
|   |   |   |                           FullImageActivity$1.class
|   |   |   |                           FullImageActivity.class
|   |   |   |                           Home$1.class
|   |   |   |                           Home.class
|   |   |   |                           ImageAdapter$ImageListViewHolder$1.class
|   |   |   |                           ImageAdapter$ImageListViewHolder.class
|   |   |   |                           ImageAdapter$ImagePickerViewHolder$1.class
|   |   |   |                           ImageAdapter$ImagePickerViewHolder.class
|   |   |   |                           ImageAdapter$OnItemClickListener.class
|   |   |   |                           ImageAdapter.class
|   |   |   |                           ImageModel.class
|   |   |   |                           ImagesActivity$1.class
|   |   |   |                           ImagesActivity$2.class
|   |   |   |                           ImagesActivity$3.class
|   |   |   |                           ImagesActivity.class
|   |   |   |                           MainActivity$1.class
|   |   |   |                           MainActivity$2.class
|   |   |   |                           MainActivity$3.class
|   |   |   |                           MainActivity.class
|   |   |   |                           MainActivity2.class
|   |   |   |                           MainActivity3$1.class
|   |   |   |                           MainActivity3.class
|   |   |   |                           ProcessActivity$1.class
|   |   |   |                           ProcessActivity$2.class
|   |   |   |                           ProcessActivity$3.class
|   |   |   |                           ProcessActivity.class
|   |   |   |                           Questionnaire.class
|   |   |   |                           SecondFragment$1.class
|   |   |   |                           SecondFragment.class
|   |   |   |                           SelectedImageAdapter$1.class
|   |   |   |                           SelectedImageAdapter$ViewHolder.class
|   |   |   |                           SelectedImageAdapter.class
|   |   |   |                           ShowInfo.class
|   |   |   |                           Splash$1$1.class
|   |   |   |                           Splash$1.class
|   |   |   |                           Splash.class
|   |   |   |                           Student.class
|   |   |   |                           TableInfo.class
|   |   |   |                           
|   |   |   +---manifest_merge_blame_file
|   |   |   |   \---debug
|   |   |   |           manifest-merger-blame-debug-report.txt
|   |   |   |           
|   |   |   +---merged_assets
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           \---chaquopy
|   |   |   |               |   app.imy
|   |   |   |               |   bootstrap.imy
|   |   |   |               |   build.json
|   |   |   |               |   cacert.pem
|   |   |   |               |   requirements-arm64-v8a.imy
|   |   |   |               |   requirements-armeabi-v7a.imy
|   |   |   |               |   requirements-common.imy
|   |   |   |               |   requirements-x86.imy
|   |   |   |               |   requirements-x86_64.imy
|   |   |   |               |   stdlib-arm64-v8a.imy
|   |   |   |               |   stdlib-armeabi-v7a.imy
|   |   |   |               |   stdlib-common.imy
|   |   |   |               |   stdlib-x86.imy
|   |   |   |               |   stdlib-x86_64.imy
|   |   |   |               |   ticket.txt
|   |   |   |               |   
|   |   |   |               \---bootstrap-native
|   |   |   |                   +---arm64-v8a
|   |   |   |                   |   |   binascii.so
|   |   |   |                   |   |   math.so
|   |   |   |                   |   |   mmap.so
|   |   |   |                   |   |   zlib.so
|   |   |   |                   |   |   _csv.so
|   |   |   |                   |   |   _ctypes.so
|   |   |   |                   |   |   _datetime.so
|   |   |   |                   |   |   _hashlib.so
|   |   |   |                   |   |   _json.so
|   |   |   |                   |   |   _random.so
|   |   |   |                   |   |   _struct.so
|   |   |   |                   |   |   
|   |   |   |                   |   \---java
|   |   |   |                   |           chaquopy.so
|   |   |   |                   |           chaquopy_android.so
|   |   |   |                   |           __init__.py
|   |   |   |                   |           
|   |   |   |                   +---armeabi-v7a
|   |   |   |                   |   |   binascii.so
|   |   |   |                   |   |   math.so
|   |   |   |                   |   |   mmap.so
|   |   |   |                   |   |   zlib.so
|   |   |   |                   |   |   _csv.so
|   |   |   |                   |   |   _ctypes.so
|   |   |   |                   |   |   _datetime.so
|   |   |   |                   |   |   _hashlib.so
|   |   |   |                   |   |   _json.so
|   |   |   |                   |   |   _random.so
|   |   |   |                   |   |   _struct.so
|   |   |   |                   |   |   
|   |   |   |                   |   \---java
|   |   |   |                   |           chaquopy.so
|   |   |   |                   |           chaquopy_android.so
|   |   |   |                   |           __init__.py
|   |   |   |                   |           
|   |   |   |                   +---x86
|   |   |   |                   |   |   binascii.so
|   |   |   |                   |   |   math.so
|   |   |   |                   |   |   mmap.so
|   |   |   |                   |   |   zlib.so
|   |   |   |                   |   |   _csv.so
|   |   |   |                   |   |   _ctypes.so
|   |   |   |                   |   |   _datetime.so
|   |   |   |                   |   |   _hashlib.so
|   |   |   |                   |   |   _json.so
|   |   |   |                   |   |   _random.so
|   |   |   |                   |   |   _struct.so
|   |   |   |                   |   |   
|   |   |   |                   |   \---java
|   |   |   |                   |           chaquopy.so
|   |   |   |                   |           chaquopy_android.so
|   |   |   |                   |           __init__.py
|   |   |   |                   |           
|   |   |   |                   \---x86_64
|   |   |   |                       |   binascii.so
|   |   |   |                       |   math.so
|   |   |   |                       |   mmap.so
|   |   |   |                       |   zlib.so
|   |   |   |                       |   _csv.so
|   |   |   |                       |   _ctypes.so
|   |   |   |                       |   _datetime.so
|   |   |   |                       |   _hashlib.so
|   |   |   |                       |   _json.so
|   |   |   |                       |   _random.so
|   |   |   |                       |   _struct.so
|   |   |   |                       |   
|   |   |   |                       \---java
|   |   |   |                               chaquopy.so
|   |   |   |                               chaquopy_android.so
|   |   |   |                               __init__.py
|   |   |   |                               
|   |   |   +---merged_java_res
|   |   |   |   \---debug
|   |   |   |           out.jar
|   |   |   |           
|   |   |   +---merged_jni_libs
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           +---arm64-v8a
|   |   |   |           |       libchaquopy_java.so
|   |   |   |           |       libcrypto_chaquopy.so
|   |   |   |           |       libpython3.8.so
|   |   |   |           |       libsqlite3_chaquopy.so
|   |   |   |           |       libssl_chaquopy.so
|   |   |   |           |       
|   |   |   |           +---armeabi-v7a
|   |   |   |           |       libchaquopy_java.so
|   |   |   |           |       libcrypto_chaquopy.so
|   |   |   |           |       libpython3.8.so
|   |   |   |           |       libsqlite3_chaquopy.so
|   |   |   |           |       libssl_chaquopy.so
|   |   |   |           |       
|   |   |   |           +---x86
|   |   |   |           |       libchaquopy_java.so
|   |   |   |           |       libcrypto_chaquopy.so
|   |   |   |           |       libpython3.8.so
|   |   |   |           |       libsqlite3_chaquopy.so
|   |   |   |           |       libssl_chaquopy.so
|   |   |   |           |       
|   |   |   |           \---x86_64
|   |   |   |                   libchaquopy_java.so
|   |   |   |                   libcrypto_chaquopy.so
|   |   |   |                   libpython3.8.so
|   |   |   |                   libsqlite3_chaquopy.so
|   |   |   |                   libssl_chaquopy.so
|   |   |   |                   
|   |   |   +---merged_manifest
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |               AndroidManifest.xml
|   |   |   |               
|   |   |   +---merged_manifests
|   |   |   |   \---debug
|   |   |   |           AndroidManifest.xml
|   |   |   |           output-metadata.json
|   |   |   |           
|   |   |   +---merged_native_libs
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           \---lib
|   |   |   |               +---arm64-v8a
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               +---armeabi-v7a
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               +---x86
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               \---x86_64
|   |   |   |                       libchaquopy_java.so
|   |   |   |                       libcrypto_chaquopy.so
|   |   |   |                       libpython3.8.so
|   |   |   |                       libsqlite3_chaquopy.so
|   |   |   |                       libssl_chaquopy.so
|   |   |   |                       
|   |   |   +---merged_res_blame_folder
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           +---multi-v2
|   |   |   |           |       debug.json
|   |   |   |           |       values-af.json
|   |   |   |           |       values-am.json
|   |   |   |           |       values-ar.json
|   |   |   |           |       values-as.json
|   |   |   |           |       values-az.json
|   |   |   |           |       values-b+sr+Latn.json
|   |   |   |           |       values-be.json
|   |   |   |           |       values-bg.json
|   |   |   |           |       values-bn.json
|   |   |   |           |       values-bs.json
|   |   |   |           |       values-ca.json
|   |   |   |           |       values-cs.json
|   |   |   |           |       values-da.json
|   |   |   |           |       values-de.json
|   |   |   |           |       values-el.json
|   |   |   |           |       values-en-rAU.json
|   |   |   |           |       values-en-rCA.json
|   |   |   |           |       values-en-rGB.json
|   |   |   |           |       values-en-rIN.json
|   |   |   |           |       values-en-rXC.json
|   |   |   |           |       values-es-rUS.json
|   |   |   |           |       values-es.json
|   |   |   |           |       values-et.json
|   |   |   |           |       values-eu.json
|   |   |   |           |       values-fa.json
|   |   |   |           |       values-fi.json
|   |   |   |           |       values-fr-rCA.json
|   |   |   |           |       values-fr.json
|   |   |   |           |       values-gl.json
|   |   |   |           |       values-gu.json
|   |   |   |           |       values-h720dp-v13.json
|   |   |   |           |       values-hdpi-v4.json
|   |   |   |           |       values-hi.json
|   |   |   |           |       values-hr.json
|   |   |   |           |       values-hu.json
|   |   |   |           |       values-hy.json
|   |   |   |           |       values-in.json
|   |   |   |           |       values-is.json
|   |   |   |           |       values-it.json
|   |   |   |           |       values-iw.json
|   |   |   |           |       values-ja.json
|   |   |   |           |       values-ka.json
|   |   |   |           |       values-kk.json
|   |   |   |           |       values-km.json
|   |   |   |           |       values-kn.json
|   |   |   |           |       values-ko.json
|   |   |   |           |       values-ky.json
|   |   |   |           |       values-land.json
|   |   |   |           |       values-large-v4.json
|   |   |   |           |       values-ldltr-v21.json
|   |   |   |           |       values-lo.json
|   |   |   |           |       values-lt.json
|   |   |   |           |       values-lv.json
|   |   |   |           |       values-mk.json
|   |   |   |           |       values-ml.json
|   |   |   |           |       values-mn.json
|   |   |   |           |       values-mr.json
|   |   |   |           |       values-ms.json
|   |   |   |           |       values-my.json
|   |   |   |           |       values-nb.json
|   |   |   |           |       values-ne.json
|   |   |   |           |       values-night-v8.json
|   |   |   |           |       values-nl.json
|   |   |   |           |       values-or.json
|   |   |   |           |       values-pa.json
|   |   |   |           |       values-pl.json
|   |   |   |           |       values-port.json
|   |   |   |           |       values-pt-rBR.json
|   |   |   |           |       values-pt-rPT.json
|   |   |   |           |       values-pt.json
|   |   |   |           |       values-ro.json
|   |   |   |           |       values-ru.json
|   |   |   |           |       values-si.json
|   |   |   |           |       values-sk.json
|   |   |   |           |       values-sl.json
|   |   |   |           |       values-sq.json
|   |   |   |           |       values-sr.json
|   |   |   |           |       values-sv.json
|   |   |   |           |       values-sw.json
|   |   |   |           |       values-sw600dp-v13.json
|   |   |   |           |       values-ta.json
|   |   |   |           |       values-te.json
|   |   |   |           |       values-th.json
|   |   |   |           |       values-tl.json
|   |   |   |           |       values-tr.json
|   |   |   |           |       values-uk.json
|   |   |   |           |       values-ur.json
|   |   |   |           |       values-uz.json
|   |   |   |           |       values-v16.json
|   |   |   |           |       values-v17.json
|   |   |   |           |       values-v18.json
|   |   |   |           |       values-v21.json
|   |   |   |           |       values-v22.json
|   |   |   |           |       values-v23.json
|   |   |   |           |       values-v24.json
|   |   |   |           |       values-v25.json
|   |   |   |           |       values-v26.json
|   |   |   |           |       values-v28.json
|   |   |   |           |       values-vi.json
|   |   |   |           |       values-watch-v20.json
|   |   |   |           |       values-watch-v21.json
|   |   |   |           |       values-xlarge-v4.json
|   |   |   |           |       values-zh-rCN.json
|   |   |   |           |       values-zh-rHK.json
|   |   |   |           |       values-zh-rTW.json
|   |   |   |           |       values-zu.json
|   |   |   |           |       values.json
|   |   |   |           |       
|   |   |   |           \---single
|   |   |   |                   debug.json
|   |   |   |                   
|   |   |   +---merged_shaders
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---metadata_feature_manifest
|   |   |   |   \---debug
|   |   |   |       +---metadata-feature
|   |   |   |       |       output.json
|   |   |   |       |       
|   |   |   |       \---processDebugManifest
|   |   |   |           \---metadata-feature
|   |   |   |                   output.json
|   |   |   |                   
|   |   |   +---mixed_scope_dex_archive
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---navigation_json
|   |   |   |   \---debug
|   |   |   |           navigation.json
|   |   |   |           
|   |   |   +---packaged_manifests
|   |   |   |   \---debug
|   |   |   |           AndroidManifest.xml
|   |   |   |           output-metadata.json
|   |   |   |           
|   |   |   +---processed_res
|   |   |   |   \---debug
|   |   |   |       +---out
|   |   |   |       |       output-metadata.json
|   |   |   |       |       resources-debug.ap_
|   |   |   |       |       
|   |   |   |       \---processDebugResources
|   |   |   |           \---out
|   |   |   |                   output.json
|   |   |   |                   resources-debug.ap_
|   |   |   |                   
|   |   |   +---project_dex_archive
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           |   c5c1ba447463d758e9b28eeef450effbff1035dfbfcb836b743b6cf17962d945_0.jar
|   |   |   |           |   c5c1ba447463d758e9b28eeef450effbff1035dfbfcb836b743b6cf17962d945_1.jar
|   |   |   |           |   c5c1ba447463d758e9b28eeef450effbff1035dfbfcb836b743b6cf17962d945_2.jar
|   |   |   |           |   c5c1ba447463d758e9b28eeef450effbff1035dfbfcb836b743b6cf17962d945_3.jar
|   |   |   |           |   
|   |   |   |           \---com
|   |   |   |               \---elevenzon
|   |   |   |                   \---image
|   |   |   |                           ActivityCheckbox$1$1.dex
|   |   |   |                           ActivityCheckbox$1.dex
|   |   |   |                           ActivityCheckbox$2$1.dex
|   |   |   |                           ActivityCheckbox$2.dex
|   |   |   |                           ActivityCheckbox$3.dex
|   |   |   |                           ActivityCheckbox$4.dex
|   |   |   |                           ActivityCheckbox$5.dex
|   |   |   |                           ActivityCheckbox$6.dex
|   |   |   |                           ActivityCheckbox.dex
|   |   |   |                           ActivityQuestionnaire$1.dex
|   |   |   |                           ActivityQuestionnaire$2.dex
|   |   |   |                           ActivityQuestionnaire.dex
|   |   |   |                           ActivitySatisfication$1$1.dex
|   |   |   |                           ActivitySatisfication$1.dex
|   |   |   |                           ActivitySatisfication$2.dex
|   |   |   |                           ActivitySatisfication$3.dex
|   |   |   |                           ActivitySatisfication$4.dex
|   |   |   |                           ActivitySatisfication$5.dex
|   |   |   |                           ActivitySatisfication$6.dex
|   |   |   |                           ActivitySatisfication.dex
|   |   |   |                           BuildConfig.dex
|   |   |   |                           CheckboxInfo.dex
|   |   |   |                           DelayedProgressDialog$1.dex
|   |   |   |                           DelayedProgressDialog$2.dex
|   |   |   |                           DelayedProgressDialog$3.dex
|   |   |   |                           DelayedProgressDialog.dex
|   |   |   |                           Detail$1.dex
|   |   |   |                           Detail$2.dex
|   |   |   |                           Detail.dex
|   |   |   |                           ExampleDialog$1.dex
|   |   |   |                           ExampleDialog.dex
|   |   |   |                           ExampleDialog2$1.dex
|   |   |   |                           ExampleDialog2.dex
|   |   |   |                           FirstFragment$1.dex
|   |   |   |                           FirstFragment.dex
|   |   |   |                           FullImageActivity$1.dex
|   |   |   |                           FullImageActivity.dex
|   |   |   |                           Home$1.dex
|   |   |   |                           Home.dex
|   |   |   |                           ImageAdapter$ImageListViewHolder$1.dex
|   |   |   |                           ImageAdapter$ImageListViewHolder.dex
|   |   |   |                           ImageAdapter$ImagePickerViewHolder$1.dex
|   |   |   |                           ImageAdapter$ImagePickerViewHolder.dex
|   |   |   |                           ImageAdapter$OnItemClickListener.dex
|   |   |   |                           ImageAdapter.dex
|   |   |   |                           ImageModel.dex
|   |   |   |                           ImagesActivity$1.dex
|   |   |   |                           ImagesActivity$2.dex
|   |   |   |                           ImagesActivity$3.dex
|   |   |   |                           ImagesActivity.dex
|   |   |   |                           MainActivity$1.dex
|   |   |   |                           MainActivity$2.dex
|   |   |   |                           MainActivity$3.dex
|   |   |   |                           MainActivity.dex
|   |   |   |                           MainActivity2.dex
|   |   |   |                           MainActivity3$1.dex
|   |   |   |                           MainActivity3.dex
|   |   |   |                           ProcessActivity$1.dex
|   |   |   |                           ProcessActivity$2.dex
|   |   |   |                           ProcessActivity$3.dex
|   |   |   |                           ProcessActivity.dex
|   |   |   |                           Questionnaire.dex
|   |   |   |                           SecondFragment$1.dex
|   |   |   |                           SecondFragment.dex
|   |   |   |                           SelectedImageAdapter$1.dex
|   |   |   |                           SelectedImageAdapter$ViewHolder.dex
|   |   |   |                           SelectedImageAdapter.dex
|   |   |   |                           ShowInfo.dex
|   |   |   |                           Splash$1$1.dex
|   |   |   |                           Splash$1.dex
|   |   |   |                           Splash.dex
|   |   |   |                           Student.dex
|   |   |   |                           TableInfo.dex
|   |   |   |                           
|   |   |   +---res
|   |   |   |   +---merged
|   |   |   |   |   \---debug
|   |   |   |   |           drawable-anydpi-v21_ic_action_name.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_arrow_back_white_24dp.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_camera.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_camera_white_30dp.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_checkbox.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_checked.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_click.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_doc.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_document.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_export.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_folder_white_30dp.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_graph.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_home.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_launcher_background.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_next.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_previous.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_send_white_20dp.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_stat_name.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_submit.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_table.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_unchecked.xml.flat
|   |   |   |   |           drawable-anydpi-v21_ic_view.xml.flat
|   |   |   |   |           drawable-anydpi-v24_ic_add.xml.flat
|   |   |   |   |           drawable-anydpi-v24_ic_close.xml.flat
|   |   |   |   |           drawable-anydpi-v24_ic_launcher_foreground.xml.flat
|   |   |   |   |           drawable-hdpi_ex.png.flat
|   |   |   |   |           drawable-hdpi_ic_action_name.png.flat
|   |   |   |   |           drawable-hdpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-hdpi_ic_camera.png.flat
|   |   |   |   |           drawable-hdpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-hdpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-hdpi_ic_checked.png.flat
|   |   |   |   |           drawable-hdpi_ic_click.png.flat
|   |   |   |   |           drawable-hdpi_ic_doc.png.flat
|   |   |   |   |           drawable-hdpi_ic_document.png.flat
|   |   |   |   |           drawable-hdpi_ic_export.png.flat
|   |   |   |   |           drawable-hdpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-hdpi_ic_graph.png.flat
|   |   |   |   |           drawable-hdpi_ic_home.png.flat
|   |   |   |   |           drawable-hdpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-hdpi_ic_next.png.flat
|   |   |   |   |           drawable-hdpi_ic_previous.png.flat
|   |   |   |   |           drawable-hdpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-hdpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-hdpi_ic_submit.png.flat
|   |   |   |   |           drawable-hdpi_ic_table.png.flat
|   |   |   |   |           drawable-hdpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-hdpi_ic_view.png.flat
|   |   |   |   |           drawable-ldpi_ic_action_name.png.flat
|   |   |   |   |           drawable-ldpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-ldpi_ic_camera.png.flat
|   |   |   |   |           drawable-ldpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-ldpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-ldpi_ic_checked.png.flat
|   |   |   |   |           drawable-ldpi_ic_click.png.flat
|   |   |   |   |           drawable-ldpi_ic_doc.png.flat
|   |   |   |   |           drawable-ldpi_ic_document.png.flat
|   |   |   |   |           drawable-ldpi_ic_export.png.flat
|   |   |   |   |           drawable-ldpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-ldpi_ic_graph.png.flat
|   |   |   |   |           drawable-ldpi_ic_home.png.flat
|   |   |   |   |           drawable-ldpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-ldpi_ic_next.png.flat
|   |   |   |   |           drawable-ldpi_ic_previous.png.flat
|   |   |   |   |           drawable-ldpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-ldpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-ldpi_ic_submit.png.flat
|   |   |   |   |           drawable-ldpi_ic_table.png.flat
|   |   |   |   |           drawable-ldpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-ldpi_ic_view.png.flat
|   |   |   |   |           drawable-mdpi_ic_action_name.png.flat
|   |   |   |   |           drawable-mdpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-mdpi_ic_camera.png.flat
|   |   |   |   |           drawable-mdpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-mdpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-mdpi_ic_checked.png.flat
|   |   |   |   |           drawable-mdpi_ic_click.png.flat
|   |   |   |   |           drawable-mdpi_ic_doc.png.flat
|   |   |   |   |           drawable-mdpi_ic_document.png.flat
|   |   |   |   |           drawable-mdpi_ic_export.png.flat
|   |   |   |   |           drawable-mdpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-mdpi_ic_graph.png.flat
|   |   |   |   |           drawable-mdpi_ic_home.png.flat
|   |   |   |   |           drawable-mdpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-mdpi_ic_next.png.flat
|   |   |   |   |           drawable-mdpi_ic_previous.png.flat
|   |   |   |   |           drawable-mdpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-mdpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-mdpi_ic_submit.png.flat
|   |   |   |   |           drawable-mdpi_ic_table.png.flat
|   |   |   |   |           drawable-mdpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-mdpi_ic_view.png.flat
|   |   |   |   |           drawable-v24_explain.png.flat
|   |   |   |   |           drawable-v24_pic_app.png.flat
|   |   |   |   |           drawable-v24_pic_ques.png.flat
|   |   |   |   |           drawable-v24_round_grey.xml.flat
|   |   |   |   |           drawable-v24_round_normal.xml.flat
|   |   |   |   |           drawable-v24_round_primary.xml.flat
|   |   |   |   |           drawable-xhdpi_ic_action_name.png.flat
|   |   |   |   |           drawable-xhdpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-xhdpi_ic_camera.png.flat
|   |   |   |   |           drawable-xhdpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-xhdpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-xhdpi_ic_checked.png.flat
|   |   |   |   |           drawable-xhdpi_ic_click.png.flat
|   |   |   |   |           drawable-xhdpi_ic_doc.png.flat
|   |   |   |   |           drawable-xhdpi_ic_document.png.flat
|   |   |   |   |           drawable-xhdpi_ic_export.png.flat
|   |   |   |   |           drawable-xhdpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-xhdpi_ic_graph.png.flat
|   |   |   |   |           drawable-xhdpi_ic_home.png.flat
|   |   |   |   |           drawable-xhdpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-xhdpi_ic_next.png.flat
|   |   |   |   |           drawable-xhdpi_ic_previous.png.flat
|   |   |   |   |           drawable-xhdpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-xhdpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-xhdpi_ic_submit.png.flat
|   |   |   |   |           drawable-xhdpi_ic_table.png.flat
|   |   |   |   |           drawable-xhdpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-xhdpi_ic_view.png.flat
|   |   |   |   |           drawable-xxhdpi_bg2.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_action_name.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_camera.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_checked.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_click.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_doc.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_document.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_export.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_graph.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_home.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_next.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_previous.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_submit.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_table.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-xxhdpi_ic_view.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_action_name.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_arrow_back_white_24dp.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_camera.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_camera_white_30dp.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_checkbox.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_checked.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_click.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_doc.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_document.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_export.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_folder_white_30dp.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_graph.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_home.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_launcher_background.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_next.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_previous.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_send_white_20dp.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_stat_name.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_submit.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_table.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_unchecked.png.flat
|   |   |   |   |           drawable-xxxhdpi_ic_view.png.flat
|   |   |   |   |           drawable_custom_checkbox.xml.flat
|   |   |   |   |           drawable_gradient_background.xml.flat
|   |   |   |   |           drawable_shadow.xml.flat
|   |   |   |   |           drawable_splash.xml.flat
|   |   |   |   |           layout_activity_full_image.xml.flat
|   |   |   |   |           layout_activity_images.xml.flat
|   |   |   |   |           layout_activity_main.xml.flat
|   |   |   |   |           layout_activity_main2.xml.flat
|   |   |   |   |           layout_activity_main3.xml.flat
|   |   |   |   |           layout_activity_process.xml.flat
|   |   |   |   |           layout_activity_splash.xml.flat
|   |   |   |   |           layout_content_main2.xml.flat
|   |   |   |   |           layout_custom_dialog.xml.flat
|   |   |   |   |           layout_custom_dialog2.xml.flat
|   |   |   |   |           layout_detail.xml.flat
|   |   |   |   |           layout_dialog_progress.xml.flat
|   |   |   |   |           layout_fragment_first.xml.flat
|   |   |   |   |           layout_fragment_second.xml.flat
|   |   |   |   |           layout_home.xml.flat
|   |   |   |   |           layout_image_list.xml.flat
|   |   |   |   |           layout_image_picker_list.xml.flat
|   |   |   |   |           layout_info_checkbox.xml.flat
|   |   |   |   |           layout_info_ques.xml.flat
|   |   |   |   |           layout_info_satisfication.xml.flat
|   |   |   |   |           layout_row.xml.flat
|   |   |   |   |           layout_row_tb.xml.flat
|   |   |   |   |           layout_selected_image_list.xml.flat
|   |   |   |   |           layout_show_info.xml.flat
|   |   |   |   |           mipmap-anydpi-v26_ic_launcher.xml.flat
|   |   |   |   |           mipmap-anydpi-v26_ic_launcher_round.xml.flat
|   |   |   |   |           mipmap-hdpi_ic_app.png.flat
|   |   |   |   |           mipmap-hdpi_ic_back2.png.flat
|   |   |   |   |           mipmap-hdpi_ic_launcher.png.flat
|   |   |   |   |           mipmap-hdpi_ic_launcher_round.png.flat
|   |   |   |   |           mipmap-mdpi_ic_app.png.flat
|   |   |   |   |           mipmap-mdpi_ic_back2.png.flat
|   |   |   |   |           mipmap-mdpi_ic_launcher.png.flat
|   |   |   |   |           mipmap-mdpi_ic_launcher_round.png.flat
|   |   |   |   |           mipmap-xhdpi_app.png.flat
|   |   |   |   |           mipmap-xhdpi_ic_app.png.flat
|   |   |   |   |           mipmap-xhdpi_ic_back2.png.flat
|   |   |   |   |           mipmap-xhdpi_ic_launcher.png.flat
|   |   |   |   |           mipmap-xhdpi_ic_launcher_round.png.flat
|   |   |   |   |           mipmap-xxhdpi_ic_app.png.flat
|   |   |   |   |           mipmap-xxhdpi_ic_back2.png.flat
|   |   |   |   |           mipmap-xxhdpi_ic_launcher.png.flat
|   |   |   |   |           mipmap-xxhdpi_ic_launcher_round.png.flat
|   |   |   |   |           mipmap-xxxhdpi_ic_app.png.flat
|   |   |   |   |           mipmap-xxxhdpi_ic_back2.png.flat
|   |   |   |   |           mipmap-xxxhdpi_ic_launcher.png.flat
|   |   |   |   |           mipmap-xxxhdpi_ic_launcher_round.png.flat
|   |   |   |   |           navigation_nav_graph.xml.flat
|   |   |   |   |           values-af_values-af.arsc.flat
|   |   |   |   |           values-am_values-am.arsc.flat
|   |   |   |   |           values-ar_values-ar.arsc.flat
|   |   |   |   |           values-as_values-as.arsc.flat
|   |   |   |   |           values-az_values-az.arsc.flat
|   |   |   |   |           values-b+sr+Latn_values-b+sr+Latn.arsc.flat
|   |   |   |   |           values-be_values-be.arsc.flat
|   |   |   |   |           values-bg_values-bg.arsc.flat
|   |   |   |   |           values-bn_values-bn.arsc.flat
|   |   |   |   |           values-bs_values-bs.arsc.flat
|   |   |   |   |           values-ca_values-ca.arsc.flat
|   |   |   |   |           values-cs_values-cs.arsc.flat
|   |   |   |   |           values-da_values-da.arsc.flat
|   |   |   |   |           values-de_values-de.arsc.flat
|   |   |   |   |           values-el_values-el.arsc.flat
|   |   |   |   |           values-en-rAU_values-en-rAU.arsc.flat
|   |   |   |   |           values-en-rCA_values-en-rCA.arsc.flat
|   |   |   |   |           values-en-rGB_values-en-rGB.arsc.flat
|   |   |   |   |           values-en-rIN_values-en-rIN.arsc.flat
|   |   |   |   |           values-en-rXC_values-en-rXC.arsc.flat
|   |   |   |   |           values-es-rUS_values-es-rUS.arsc.flat
|   |   |   |   |           values-es_values-es.arsc.flat
|   |   |   |   |           values-et_values-et.arsc.flat
|   |   |   |   |           values-eu_values-eu.arsc.flat
|   |   |   |   |           values-fa_values-fa.arsc.flat
|   |   |   |   |           values-fi_values-fi.arsc.flat
|   |   |   |   |           values-fr-rCA_values-fr-rCA.arsc.flat
|   |   |   |   |           values-fr_values-fr.arsc.flat
|   |   |   |   |           values-gl_values-gl.arsc.flat
|   |   |   |   |           values-gu_values-gu.arsc.flat
|   |   |   |   |           values-h720dp-v13_values-h720dp-v13.arsc.flat
|   |   |   |   |           values-hdpi-v4_values-hdpi-v4.arsc.flat
|   |   |   |   |           values-hi_values-hi.arsc.flat
|   |   |   |   |           values-hr_values-hr.arsc.flat
|   |   |   |   |           values-hu_values-hu.arsc.flat
|   |   |   |   |           values-hy_values-hy.arsc.flat
|   |   |   |   |           values-in_values-in.arsc.flat
|   |   |   |   |           values-is_values-is.arsc.flat
|   |   |   |   |           values-it_values-it.arsc.flat
|   |   |   |   |           values-iw_values-iw.arsc.flat
|   |   |   |   |           values-ja_values-ja.arsc.flat
|   |   |   |   |           values-ka_values-ka.arsc.flat
|   |   |   |   |           values-kk_values-kk.arsc.flat
|   |   |   |   |           values-km_values-km.arsc.flat
|   |   |   |   |           values-kn_values-kn.arsc.flat
|   |   |   |   |           values-ko_values-ko.arsc.flat
|   |   |   |   |           values-ky_values-ky.arsc.flat
|   |   |   |   |           values-land_values-land.arsc.flat
|   |   |   |   |           values-large-v4_values-large-v4.arsc.flat
|   |   |   |   |           values-ldltr-v21_values-ldltr-v21.arsc.flat
|   |   |   |   |           values-lo_values-lo.arsc.flat
|   |   |   |   |           values-lt_values-lt.arsc.flat
|   |   |   |   |           values-lv_values-lv.arsc.flat
|   |   |   |   |           values-mk_values-mk.arsc.flat
|   |   |   |   |           values-ml_values-ml.arsc.flat
|   |   |   |   |           values-mn_values-mn.arsc.flat
|   |   |   |   |           values-mr_values-mr.arsc.flat
|   |   |   |   |           values-ms_values-ms.arsc.flat
|   |   |   |   |           values-my_values-my.arsc.flat
|   |   |   |   |           values-nb_values-nb.arsc.flat
|   |   |   |   |           values-ne_values-ne.arsc.flat
|   |   |   |   |           values-night-v8_values-night-v8.arsc.flat
|   |   |   |   |           values-nl_values-nl.arsc.flat
|   |   |   |   |           values-or_values-or.arsc.flat
|   |   |   |   |           values-pa_values-pa.arsc.flat
|   |   |   |   |           values-pl_values-pl.arsc.flat
|   |   |   |   |           values-port_values-port.arsc.flat
|   |   |   |   |           values-pt-rBR_values-pt-rBR.arsc.flat
|   |   |   |   |           values-pt-rPT_values-pt-rPT.arsc.flat
|   |   |   |   |           values-pt_values-pt.arsc.flat
|   |   |   |   |           values-ro_values-ro.arsc.flat
|   |   |   |   |           values-ru_values-ru.arsc.flat
|   |   |   |   |           values-si_values-si.arsc.flat
|   |   |   |   |           values-sk_values-sk.arsc.flat
|   |   |   |   |           values-sl_values-sl.arsc.flat
|   |   |   |   |           values-sq_values-sq.arsc.flat
|   |   |   |   |           values-sr_values-sr.arsc.flat
|   |   |   |   |           values-sv_values-sv.arsc.flat
|   |   |   |   |           values-sw600dp-v13_values-sw600dp-v13.arsc.flat
|   |   |   |   |           values-sw_values-sw.arsc.flat
|   |   |   |   |           values-ta_values-ta.arsc.flat
|   |   |   |   |           values-te_values-te.arsc.flat
|   |   |   |   |           values-th_values-th.arsc.flat
|   |   |   |   |           values-tl_values-tl.arsc.flat
|   |   |   |   |           values-tr_values-tr.arsc.flat
|   |   |   |   |           values-uk_values-uk.arsc.flat
|   |   |   |   |           values-ur_values-ur.arsc.flat
|   |   |   |   |           values-uz_values-uz.arsc.flat
|   |   |   |   |           values-v16_values-v16.arsc.flat
|   |   |   |   |           values-v17_values-v17.arsc.flat
|   |   |   |   |           values-v18_values-v18.arsc.flat
|   |   |   |   |           values-v21_values-v21.arsc.flat
|   |   |   |   |           values-v22_values-v22.arsc.flat
|   |   |   |   |           values-v23_values-v23.arsc.flat
|   |   |   |   |           values-v24_values-v24.arsc.flat
|   |   |   |   |           values-v25_values-v25.arsc.flat
|   |   |   |   |           values-v26_values-v26.arsc.flat
|   |   |   |   |           values-v28_values-v28.arsc.flat
|   |   |   |   |           values-vi_values-vi.arsc.flat
|   |   |   |   |           values-watch-v20_values-watch-v20.arsc.flat
|   |   |   |   |           values-watch-v21_values-watch-v21.arsc.flat
|   |   |   |   |           values-xlarge-v4_values-xlarge-v4.arsc.flat
|   |   |   |   |           values-zh-rCN_values-zh-rCN.arsc.flat
|   |   |   |   |           values-zh-rHK_values-zh-rHK.arsc.flat
|   |   |   |   |           values-zh-rTW_values-zh-rTW.arsc.flat
|   |   |   |   |           values-zu_values-zu.arsc.flat
|   |   |   |   |           values_values.arsc.flat
|   |   |   |   |           xml_provider_paths.xml.flat
|   |   |   |   |           
|   |   |   |   \---symbol-table-with-package
|   |   |   |       \---debug
|   |   |   |               package-aware-r.txt
|   |   |   |               
|   |   |   +---runtime_symbol_list
|   |   |   |   \---debug
|   |   |   |           R.txt
|   |   |   |           
|   |   |   +---shader_assets
|   |   |   |   \---debug
|   |   |   |       \---compileDebugShaders
|   |   |   |           \---out
|   |   |   +---signing_config
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |               signing-config.json
|   |   |   |               
|   |   |   +---stripped_native_libs
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   |           \---lib
|   |   |   |               +---arm64-v8a
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               +---armeabi-v7a
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               +---x86
|   |   |   |               |       libchaquopy_java.so
|   |   |   |               |       libcrypto_chaquopy.so
|   |   |   |               |       libpython3.8.so
|   |   |   |               |       libsqlite3_chaquopy.so
|   |   |   |               |       libssl_chaquopy.so
|   |   |   |               |       
|   |   |   |               \---x86_64
|   |   |   |                       libchaquopy_java.so
|   |   |   |                       libcrypto_chaquopy.so
|   |   |   |                       libpython3.8.so
|   |   |   |                       libsqlite3_chaquopy.so
|   |   |   |                       libssl_chaquopy.so
|   |   |   |                       
|   |   |   +---sub_project_dex_archive
|   |   |   |   \---debug
|   |   |   |       \---out
|   |   |   +---symbols
|   |   |   |   \---debug
|   |   |   |           R.txt
|   |   |   |           
|   |   |   +---symbol_list_with_package_name
|   |   |   |   \---debug
|   |   |   |           package-aware-r.txt
|   |   |   |           
|   |   |   +---transforms
|   |   |   |   \---dexBuilder
|   |   |   |       \---debug
|   |   |   |           |   __content__.json
|   |   |   |           |   
|   |   |   |           \---0
|   |   |   |               +---android
|   |   |   |               |   +---arch
|   |   |   |               |   |   +---core
|   |   |   |               |   |   |       R.dex
|   |   |   |               |   |   |       
|   |   |   |               |   |   \---lifecycle
|   |   |   |               |   |       |   R.dex
|   |   |   |               |   |       |   
|   |   |   |               |   |       +---livedata
|   |   |   |               |   |       |   |   R.dex
|   |   |   |               |   |       |   |   
|   |   |   |               |   |       |   \---core
|   |   |   |               |   |       |           R.dex
|   |   |   |               |   |       |           
|   |   |   |               |   |       \---viewmodel
|   |   |   |               |   |               R.dex
|   |   |   |               |   |               
|   |   |   |               |   \---support
|   |   |   |               |       +---asynclayoutinflater
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---compat
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---constraint
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---coordinatorlayout
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---coreui
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---coreutils
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---cursoradapter
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---customview
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---design
|   |   |   |               |       |       R$anim.dex
|   |   |   |               |       |       R$animator.dex
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$bool.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$interpolator.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---documentfile
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---drawerlayout
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---fragment
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---graphics
|   |   |   |               |       |   \---drawable
|   |   |   |               |       |           R$attr.dex
|   |   |   |               |       |           R$color.dex
|   |   |   |               |       |           R$dimen.dex
|   |   |   |               |       |           R$drawable.dex
|   |   |   |               |       |           R$id.dex
|   |   |   |               |       |           R$integer.dex
|   |   |   |               |       |           R$layout.dex
|   |   |   |               |       |           R$string.dex
|   |   |   |               |       |           R$style.dex
|   |   |   |               |       |           R$styleable.dex
|   |   |   |               |       |           R.dex
|   |   |   |               |       |           
|   |   |   |               |       +---interpolator
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---loader
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---localbroadcastmanager
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---print
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---slidingpanelayout
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---swiperefreshlayout
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       +---transition
|   |   |   |               |       |       R$attr.dex
|   |   |   |               |       |       R$color.dex
|   |   |   |               |       |       R$dimen.dex
|   |   |   |               |       |       R$drawable.dex
|   |   |   |               |       |       R$id.dex
|   |   |   |               |       |       R$integer.dex
|   |   |   |               |       |       R$layout.dex
|   |   |   |               |       |       R$string.dex
|   |   |   |               |       |       R$style.dex
|   |   |   |               |       |       R$styleable.dex
|   |   |   |               |       |       R.dex
|   |   |   |               |       |       
|   |   |   |               |       \---v7
|   |   |   |               |           +---appcompat
|   |   |   |               |           |       R$anim.dex
|   |   |   |               |           |       R$attr.dex
|   |   |   |               |           |       R$bool.dex
|   |   |   |               |           |       R$color.dex
|   |   |   |               |           |       R$dimen.dex
|   |   |   |               |           |       R$drawable.dex
|   |   |   |               |           |       R$id.dex
|   |   |   |               |           |       R$integer.dex
|   |   |   |               |           |       R$layout.dex
|   |   |   |               |           |       R$string.dex
|   |   |   |               |           |       R$style.dex
|   |   |   |               |           |       R$styleable.dex
|   |   |   |               |           |       R.dex
|   |   |   |               |           |       
|   |   |   |               |           +---cardview
|   |   |   |               |           |       R$attr.dex
|   |   |   |               |           |       R$color.dex
|   |   |   |               |           |       R$dimen.dex
|   |   |   |               |           |       R$style.dex
|   |   |   |               |           |       R$styleable.dex
|   |   |   |               |           |       R.dex
|   |   |   |               |           |       
|   |   |   |               |           +---recyclerview
|   |   |   |               |           |       R$attr.dex
|   |   |   |               |           |       R$color.dex
|   |   |   |               |           |       R$dimen.dex
|   |   |   |               |           |       R$drawable.dex
|   |   |   |               |           |       R$id.dex
|   |   |   |               |           |       R$integer.dex
|   |   |   |               |           |       R$layout.dex
|   |   |   |               |           |       R$string.dex
|   |   |   |               |           |       R$style.dex
|   |   |   |               |           |       R$styleable.dex
|   |   |   |               |           |       R.dex
|   |   |   |               |           |       
|   |   |   |               |           \---viewpager
|   |   |   |               |                   R$attr.dex
|   |   |   |               |                   R$color.dex
|   |   |   |               |                   R$dimen.dex
|   |   |   |               |                   R$drawable.dex
|   |   |   |               |                   R$id.dex
|   |   |   |               |                   R$integer.dex
|   |   |   |               |                   R$layout.dex
|   |   |   |               |                   R$string.dex
|   |   |   |               |                   R$style.dex
|   |   |   |               |                   R$styleable.dex
|   |   |   |               |                   R.dex
|   |   |   |               |                   
|   |   |   |               +---androidx
|   |   |   |               |   \---versionedparcelable
|   |   |   |               |           R.dex
|   |   |   |               |           
|   |   |   |               \---com
|   |   |   |                   +---bumptech
|   |   |   |                   |   \---glide
|   |   |   |                   |       |   R$attr.dex
|   |   |   |                   |       |   R$bool.dex
|   |   |   |                   |       |   R$color.dex
|   |   |   |                   |       |   R$dimen.dex
|   |   |   |                   |       |   R$drawable.dex
|   |   |   |                   |       |   R$id.dex
|   |   |   |                   |       |   R$integer.dex
|   |   |   |                   |       |   R$layout.dex
|   |   |   |                   |       |   R$string.dex
|   |   |   |                   |       |   R$style.dex
|   |   |   |                   |       |   R$styleable.dex
|   |   |   |                   |       |   R.dex
|   |   |   |                   |       |   
|   |   |   |                   |       \---gifdecoder
|   |   |   |                   |               R.dex
|   |   |   |                   |               
|   |   |   |                   \---elevenzon
|   |   |   |                       \---image
|   |   |   |                               BuildConfig.dex
|   |   |   |                               FullImageActivity$1.dex
|   |   |   |                               FullImageActivity.dex
|   |   |   |                               ImageAdapter$ImageListViewHolder$1.dex
|   |   |   |                               ImageAdapter$ImageListViewHolder.dex
|   |   |   |                               ImageAdapter$ImagePickerViewHolder$1.dex
|   |   |   |                               ImageAdapter$ImagePickerViewHolder.dex
|   |   |   |                               ImageAdapter$OnItemClickListener.dex
|   |   |   |                               ImageAdapter.dex
|   |   |   |                               ImageModel.dex
|   |   |   |                               ImagesActivity$1.dex
|   |   |   |                               ImagesActivity$2.dex
|   |   |   |                               ImagesActivity.dex
|   |   |   |                               R$anim.dex
|   |   |   |                               R$animator.dex
|   |   |   |                               R$attr.dex
|   |   |   |                               R$bool.dex
|   |   |   |                               R$color.dex
|   |   |   |                               R$dimen.dex
|   |   |   |                               R$drawable.dex
|   |   |   |                               R$id.dex
|   |   |   |                               R$integer.dex
|   |   |   |                               R$interpolator.dex
|   |   |   |                               R$layout.dex
|   |   |   |                               R$mipmap.dex
|   |   |   |                               R$string.dex
|   |   |   |                               R$style.dex
|   |   |   |                               R$styleable.dex
|   |   |   |                               R.dex
|   |   |   |                               SelectedImageAdapter$1.dex
|   |   |   |                               SelectedImageAdapter$ViewHolder.dex
|   |   |   |                               SelectedImageAdapter.dex
|   |   |   |                               
|   |   |   \---validate_signing_config
|   |   |       \---debug
|   |   +---outputs
|   |   |   +---apk
|   |   |   |   \---debug
|   |   |   |           app-debug.apk
|   |   |   |           output-metadata.json
|   |   |   |           
|   |   |   \---logs
|   |   |           manifest-merger-debug-report.txt
|   |   |           
|   |   +---pip
|   |   |   \---debug
|   |   |       +---arm64-v8a
|   |   |       |   +---chaquopy
|   |   |       |   |   \---lib
|   |   |       |   |           libc++_shared.so
|   |   |       |   |           libgfortran.so.3
|   |   |       |   |           libjpeg_chaquopy.so
|   |   |       |   |           libopenblas.so
|   |   |       |   |           libpng16.so
|   |   |       |   |           
|   |   |       |   +---cv2
|   |   |       |   |       cv2.so
|   |   |       |   |       
|   |   |       |   \---numpy
|   |   |       |       |   __config__.py
|   |   |       |       |   
|   |   |       |       +---core
|   |   |       |       |   |   _dummy.so
|   |   |       |       |   |   _multiarray_tests.so
|   |   |       |       |   |   _multiarray_umath.so
|   |   |       |       |   |   _operand_flag_tests.so
|   |   |       |       |   |   _rational_tests.so
|   |   |       |       |   |   _struct_ufunc_tests.so
|   |   |       |       |   |   _umath_tests.so
|   |   |       |       |   |   
|   |   |       |       |   +---include
|   |   |       |       |   |   \---numpy
|   |   |       |       |   |           _numpyconfig.h
|   |   |       |       |   |           
|   |   |       |       |   \---lib
|   |   |       |       |           libnpymath.a
|   |   |       |       |           
|   |   |       |       +---distutils
|   |   |       |       |       __config__.py
|   |   |       |       |       
|   |   |       |       +---fft
|   |   |       |       |       _pocketfft_internal.so
|   |   |       |       |       
|   |   |       |       +---linalg
|   |   |       |       |       lapack_lite.so
|   |   |       |       |       _umath_linalg.so
|   |   |       |       |       
|   |   |       |       \---random
|   |   |       |               bit_generator.so
|   |   |       |               bounded_integers.so
|   |   |       |               common.so
|   |   |       |               generator.so
|   |   |       |               mt19937.so
|   |   |       |               mtrand.so
|   |   |       |               pcg64.so
|   |   |       |               philox.so
|   |   |       |               sfc64.so
|   |   |       |               
|   |   |       +---armeabi-v7a
|   |   |       |   +---chaquopy
|   |   |       |   |   \---lib
|   |   |       |   |           libc++_shared.so
|   |   |       |   |           libgfortran.so.3
|   |   |       |   |           libjpeg_chaquopy.so
|   |   |       |   |           libopenblas.so
|   |   |       |   |           libpng16.so
|   |   |       |   |           
|   |   |       |   +---cv2
|   |   |       |   |       cv2.so
|   |   |       |   |       
|   |   |       |   \---numpy
|   |   |       |       |   __config__.py
|   |   |       |       |   
|   |   |       |       +---core
|   |   |       |       |   |   _dummy.so
|   |   |       |       |   |   _multiarray_tests.so
|   |   |       |       |   |   _multiarray_umath.so
|   |   |       |       |   |   _operand_flag_tests.so
|   |   |       |       |   |   _rational_tests.so
|   |   |       |       |   |   _struct_ufunc_tests.so
|   |   |       |       |   |   _umath_tests.so
|   |   |       |       |   |   
|   |   |       |       |   +---include
|   |   |       |       |   |   \---numpy
|   |   |       |       |   |           _numpyconfig.h
|   |   |       |       |   |           
|   |   |       |       |   \---lib
|   |   |       |       |           libnpymath.a
|   |   |       |       |           
|   |   |       |       +---distutils
|   |   |       |       |       __config__.py
|   |   |       |       |       
|   |   |       |       +---fft
|   |   |       |       |       _pocketfft_internal.so
|   |   |       |       |       
|   |   |       |       +---linalg
|   |   |       |       |       lapack_lite.so
|   |   |       |       |       _umath_linalg.so
|   |   |       |       |       
|   |   |       |       \---random
|   |   |       |               bit_generator.so
|   |   |       |               bounded_integers.so
|   |   |       |               common.so
|   |   |       |               generator.so
|   |   |       |               mt19937.so
|   |   |       |               mtrand.so
|   |   |       |               pcg64.so
|   |   |       |               philox.so
|   |   |       |               sfc64.so
|   |   |       |               
|   |   |       +---common
|   |   |       |   +---chaquopy_libcxx-10000.dist-info
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE.TXT
|   |   |       |   |       METADATA
|   |   |       |   |       
|   |   |       |   +---chaquopy_libgfortran-4.9.dist-info
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE.txt
|   |   |       |   |       METADATA
|   |   |       |   |       
|   |   |       |   +---chaquopy_libjpeg-1.5.3.dist-info
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE.md
|   |   |       |   |       METADATA
|   |   |       |   |       
|   |   |       |   +---chaquopy_libpng-1.6.34.dist-info
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE
|   |   |       |   |       METADATA
|   |   |       |   |       
|   |   |       |   +---chaquopy_openblas-0.2.20.dist-info
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE
|   |   |       |   |       METADATA
|   |   |       |   |       
|   |   |       |   +---cv2
|   |   |       |   |   |   LICENSE-3RD-PARTY.txt
|   |   |       |   |   |   LICENSE.txt
|   |   |       |   |   |   version.py
|   |   |       |   |   |   __init__.py
|   |   |       |   |   |   
|   |   |       |   |   \---data
|   |   |       |   |           haarcascade_eye.xml
|   |   |       |   |           haarcascade_eye_tree_eyeglasses.xml
|   |   |       |   |           haarcascade_frontalcatface.xml
|   |   |       |   |           haarcascade_frontalcatface_extended.xml
|   |   |       |   |           haarcascade_frontalface_alt.xml
|   |   |       |   |           haarcascade_frontalface_alt2.xml
|   |   |       |   |           haarcascade_frontalface_alt_tree.xml
|   |   |       |   |           haarcascade_frontalface_default.xml
|   |   |       |   |           haarcascade_fullbody.xml
|   |   |       |   |           haarcascade_lefteye_2splits.xml
|   |   |       |   |           haarcascade_licence_plate_rus_16stages.xml
|   |   |       |   |           haarcascade_lowerbody.xml
|   |   |       |   |           haarcascade_profileface.xml
|   |   |       |   |           haarcascade_righteye_2splits.xml
|   |   |       |   |           haarcascade_russian_plate_number.xml
|   |   |       |   |           haarcascade_smile.xml
|   |   |       |   |           haarcascade_upperbody.xml
|   |   |       |   |           __init__.py
|   |   |       |   |           
|   |   |       |   +---numpy
|   |   |       |   |   |   conftest.py
|   |   |       |   |   |   ctypeslib.py
|   |   |       |   |   |   dual.py
|   |   |       |   |   |   LICENSE.txt
|   |   |       |   |   |   matlib.py
|   |   |       |   |   |   setup.py
|   |   |       |   |   |   version.py
|   |   |       |   |   |   _distributor_init.py
|   |   |       |   |   |   _globals.py
|   |   |       |   |   |   _pytesttester.py
|   |   |       |   |   |   __init__.py
|   |   |       |   |   |   
|   |   |       |   |   +---compat
|   |   |       |   |   |   |   py3k.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   _inspect.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_compat.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---core
|   |   |       |   |   |   |   arrayprint.py
|   |   |       |   |   |   |   cversions.py
|   |   |       |   |   |   |   defchararray.py
|   |   |       |   |   |   |   einsumfunc.py
|   |   |       |   |   |   |   fromnumeric.py
|   |   |       |   |   |   |   function_base.py
|   |   |       |   |   |   |   generate_numpy_api.py
|   |   |       |   |   |   |   getlimits.py
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   machar.py
|   |   |       |   |   |   |   memmap.py
|   |   |       |   |   |   |   multiarray.py
|   |   |       |   |   |   |   numeric.py
|   |   |       |   |   |   |   numerictypes.py
|   |   |       |   |   |   |   overrides.py
|   |   |       |   |   |   |   records.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   setup_common.py
|   |   |       |   |   |   |   shape_base.py
|   |   |       |   |   |   |   umath.py
|   |   |       |   |   |   |   umath_tests.py
|   |   |       |   |   |   |   _add_newdocs.py
|   |   |       |   |   |   |   _aliased_types.py
|   |   |       |   |   |   |   _asarray.py
|   |   |       |   |   |   |   _dtype.py
|   |   |       |   |   |   |   _dtype_ctypes.py
|   |   |       |   |   |   |   _exceptions.py
|   |   |       |   |   |   |   _internal.py
|   |   |       |   |   |   |   _methods.py
|   |   |       |   |   |   |   _string_helpers.py
|   |   |       |   |   |   |   _type_aliases.py
|   |   |       |   |   |   |   _ufunc_config.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   +---include
|   |   |       |   |   |   |   \---numpy
|   |   |       |   |   |   |       |   arrayobject.h
|   |   |       |   |   |   |       |   arrayscalars.h
|   |   |       |   |   |   |       |   halffloat.h
|   |   |       |   |   |   |       |   multiarray_api.txt
|   |   |       |   |   |   |       |   ndarrayobject.h
|   |   |       |   |   |   |       |   ndarraytypes.h
|   |   |       |   |   |   |       |   noprefix.h
|   |   |       |   |   |   |       |   npy_1_7_deprecated_api.h
|   |   |       |   |   |   |       |   npy_3kcompat.h
|   |   |       |   |   |   |       |   npy_common.h
|   |   |       |   |   |   |       |   npy_cpu.h
|   |   |       |   |   |   |       |   npy_endian.h
|   |   |       |   |   |   |       |   npy_interrupt.h
|   |   |       |   |   |   |       |   npy_math.h
|   |   |       |   |   |   |       |   npy_no_deprecated_api.h
|   |   |       |   |   |   |       |   npy_os.h
|   |   |       |   |   |   |       |   numpyconfig.h
|   |   |       |   |   |   |       |   oldnumeric.h
|   |   |       |   |   |   |       |   old_defines.h
|   |   |       |   |   |   |       |   ufuncobject.h
|   |   |       |   |   |   |       |   ufunc_api.txt
|   |   |       |   |   |   |       |   utils.h
|   |   |       |   |   |   |       |   _neighborhood_iterator_imp.h
|   |   |       |   |   |   |       |   __multiarray_api.h
|   |   |       |   |   |   |       |   __ufunc_api.h
|   |   |       |   |   |   |       |   
|   |   |       |   |   |   |       \---random
|   |   |       |   |   |   |               bitgen.h
|   |   |       |   |   |   |               
|   |   |       |   |   |   +---lib
|   |   |       |   |   |   |   \---npy-pkg-config
|   |   |       |   |   |   |           mlib.ini
|   |   |       |   |   |   |           npymath.ini
|   |   |       |   |   |   |           
|   |   |       |   |   |   \---tests
|   |   |       |   |   |       |   test_abc.py
|   |   |       |   |   |       |   test_api.py
|   |   |       |   |   |       |   test_arrayprint.py
|   |   |       |   |   |       |   test_datetime.py
|   |   |       |   |   |       |   test_defchararray.py
|   |   |       |   |   |       |   test_deprecations.py
|   |   |       |   |   |       |   test_dtype.py
|   |   |       |   |   |       |   test_einsum.py
|   |   |       |   |   |       |   test_errstate.py
|   |   |       |   |   |       |   test_extint128.py
|   |   |       |   |   |       |   test_function_base.py
|   |   |       |   |   |       |   test_getlimits.py
|   |   |       |   |   |       |   test_half.py
|   |   |       |   |   |       |   test_indexerrors.py
|   |   |       |   |   |       |   test_indexing.py
|   |   |       |   |   |       |   test_item_selection.py
|   |   |       |   |   |       |   test_longdouble.py
|   |   |       |   |   |       |   test_machar.py
|   |   |       |   |   |       |   test_memmap.py
|   |   |       |   |   |       |   test_mem_overlap.py
|   |   |       |   |   |       |   test_multiarray.py
|   |   |       |   |   |       |   test_nditer.py
|   |   |       |   |   |       |   test_numeric.py
|   |   |       |   |   |       |   test_numerictypes.py
|   |   |       |   |   |       |   test_overrides.py
|   |   |       |   |   |       |   test_print.py
|   |   |       |   |   |       |   test_records.py
|   |   |       |   |   |       |   test_regression.py
|   |   |       |   |   |       |   test_scalarbuffer.py
|   |   |       |   |   |       |   test_scalarinherit.py
|   |   |       |   |   |       |   test_scalarmath.py
|   |   |       |   |   |       |   test_scalarprint.py
|   |   |       |   |   |       |   test_scalar_ctors.py
|   |   |       |   |   |       |   test_scalar_methods.py
|   |   |       |   |   |       |   test_shape_base.py
|   |   |       |   |   |       |   test_ufunc.py
|   |   |       |   |   |       |   test_umath.py
|   |   |       |   |   |       |   test_umath_accuracy.py
|   |   |       |   |   |       |   test_umath_complex.py
|   |   |       |   |   |       |   test_unicode.py
|   |   |       |   |   |       |   _locales.py
|   |   |       |   |   |       |   __init__.py
|   |   |       |   |   |       |   
|   |   |       |   |   |       \---data
|   |   |       |   |   |               astype_copy.pkl
|   |   |       |   |   |               recarray_from_file.fits
|   |   |       |   |   |               umath-validation-set-cos
|   |   |       |   |   |               umath-validation-set-exp
|   |   |       |   |   |               umath-validation-set-log
|   |   |       |   |   |               umath-validation-set-README
|   |   |       |   |   |               umath-validation-set-sin
|   |   |       |   |   |               
|   |   |       |   |   +---distutils
|   |   |       |   |   |   |   ccompiler.py
|   |   |       |   |   |   |   compat.py
|   |   |       |   |   |   |   conv_template.py
|   |   |       |   |   |   |   core.py
|   |   |       |   |   |   |   cpuinfo.py
|   |   |       |   |   |   |   exec_command.py
|   |   |       |   |   |   |   extension.py
|   |   |       |   |   |   |   from_template.py
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   intelccompiler.py
|   |   |       |   |   |   |   lib2def.py
|   |   |       |   |   |   |   line_endings.py
|   |   |       |   |   |   |   log.py
|   |   |       |   |   |   |   mingw32ccompiler.py
|   |   |       |   |   |   |   misc_util.py
|   |   |       |   |   |   |   msvc9compiler.py
|   |   |       |   |   |   |   msvccompiler.py
|   |   |       |   |   |   |   npy_pkg_config.py
|   |   |       |   |   |   |   numpy_distribution.py
|   |   |       |   |   |   |   pathccompiler.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   system_info.py
|   |   |       |   |   |   |   unixccompiler.py
|   |   |       |   |   |   |   _shell_utils.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   __version__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   +---command
|   |   |       |   |   |   |       autodist.py
|   |   |       |   |   |   |       bdist_rpm.py
|   |   |       |   |   |   |       build.py
|   |   |       |   |   |   |       build_clib.py
|   |   |       |   |   |   |       build_ext.py
|   |   |       |   |   |   |       build_py.py
|   |   |       |   |   |   |       build_scripts.py
|   |   |       |   |   |   |       build_src.py
|   |   |       |   |   |   |       config.py
|   |   |       |   |   |   |       config_compiler.py
|   |   |       |   |   |   |       develop.py
|   |   |       |   |   |   |       egg_info.py
|   |   |       |   |   |   |       install.py
|   |   |       |   |   |   |       install_clib.py
|   |   |       |   |   |   |       install_data.py
|   |   |       |   |   |   |       install_headers.py
|   |   |       |   |   |   |       sdist.py
|   |   |       |   |   |   |       __init__.py
|   |   |       |   |   |   |       
|   |   |       |   |   |   +---fcompiler
|   |   |       |   |   |   |       absoft.py
|   |   |       |   |   |   |       compaq.py
|   |   |       |   |   |   |       environment.py
|   |   |       |   |   |   |       g95.py
|   |   |       |   |   |   |       gnu.py
|   |   |       |   |   |   |       hpux.py
|   |   |       |   |   |   |       ibm.py
|   |   |       |   |   |   |       intel.py
|   |   |       |   |   |   |       lahey.py
|   |   |       |   |   |   |       mips.py
|   |   |       |   |   |   |       nag.py
|   |   |       |   |   |   |       none.py
|   |   |       |   |   |   |       pathf95.py
|   |   |       |   |   |   |       pg.py
|   |   |       |   |   |   |       sun.py
|   |   |       |   |   |   |       vast.py
|   |   |       |   |   |   |       __init__.py
|   |   |       |   |   |   |       
|   |   |       |   |   |   +---mingw
|   |   |       |   |   |   |       gfortran_vs2003_hack.c
|   |   |       |   |   |   |       
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_exec_command.py
|   |   |       |   |   |           test_fcompiler.py
|   |   |       |   |   |           test_fcompiler_gnu.py
|   |   |       |   |   |           test_fcompiler_intel.py
|   |   |       |   |   |           test_fcompiler_nagfor.py
|   |   |       |   |   |           test_from_template.py
|   |   |       |   |   |           test_misc_util.py
|   |   |       |   |   |           test_npy_pkg_config.py
|   |   |       |   |   |           test_shell_utils.py
|   |   |       |   |   |           test_system_info.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---doc
|   |   |       |   |   |       basics.py
|   |   |       |   |   |       broadcasting.py
|   |   |       |   |   |       byteswapping.py
|   |   |       |   |   |       constants.py
|   |   |       |   |   |       creation.py
|   |   |       |   |   |       dispatch.py
|   |   |       |   |   |       glossary.py
|   |   |       |   |   |       indexing.py
|   |   |       |   |   |       internals.py
|   |   |       |   |   |       misc.py
|   |   |       |   |   |       structured_arrays.py
|   |   |       |   |   |       subclassing.py
|   |   |       |   |   |       ufuncs.py
|   |   |       |   |   |       __init__.py
|   |   |       |   |   |       
|   |   |       |   |   +---f2py
|   |   |       |   |   |   |   auxfuncs.py
|   |   |       |   |   |   |   capi_maps.py
|   |   |       |   |   |   |   cb_rules.py
|   |   |       |   |   |   |   cfuncs.py
|   |   |       |   |   |   |   common_rules.py
|   |   |       |   |   |   |   crackfortran.py
|   |   |       |   |   |   |   diagnose.py
|   |   |       |   |   |   |   f2py2e.py
|   |   |       |   |   |   |   f2py_testing.py
|   |   |       |   |   |   |   f90mod_rules.py
|   |   |       |   |   |   |   func2subr.py
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   rules.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   use_rules.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   __main__.py
|   |   |       |   |   |   |   __version__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   +---src
|   |   |       |   |   |   |       fortranobject.c
|   |   |       |   |   |   |       fortranobject.h
|   |   |       |   |   |   |       
|   |   |       |   |   |   \---tests
|   |   |       |   |   |       |   test_array_from_pyobj.py
|   |   |       |   |   |       |   test_assumed_shape.py
|   |   |       |   |   |       |   test_block_docstring.py
|   |   |       |   |   |       |   test_callback.py
|   |   |       |   |   |       |   test_common.py
|   |   |       |   |   |       |   test_compile_function.py
|   |   |       |   |   |       |   test_kind.py
|   |   |       |   |   |       |   test_mixed.py
|   |   |       |   |   |       |   test_parameter.py
|   |   |       |   |   |       |   test_quoted_character.py
|   |   |       |   |   |       |   test_regression.py
|   |   |       |   |   |       |   test_return_character.py
|   |   |       |   |   |       |   test_return_complex.py
|   |   |       |   |   |       |   test_return_integer.py
|   |   |       |   |   |       |   test_return_logical.py
|   |   |       |   |   |       |   test_return_real.py
|   |   |       |   |   |       |   test_semicolon_split.py
|   |   |       |   |   |       |   test_size.py
|   |   |       |   |   |       |   test_string.py
|   |   |       |   |   |       |   util.py
|   |   |       |   |   |       |   __init__.py
|   |   |       |   |   |       |   
|   |   |       |   |   |       \---src
|   |   |       |   |   |           +---array_from_pyobj
|   |   |       |   |   |           |       wrapmodule.c
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---assumed_shape
|   |   |       |   |   |           |       .f2py_f2cmap
|   |   |       |   |   |           |       foo_free.f90
|   |   |       |   |   |           |       foo_mod.f90
|   |   |       |   |   |           |       foo_use.f90
|   |   |       |   |   |           |       precision.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---common
|   |   |       |   |   |           |       block.f
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---kind
|   |   |       |   |   |           |       foo.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---mixed
|   |   |       |   |   |           |       foo.f
|   |   |       |   |   |           |       foo_fixed.f90
|   |   |       |   |   |           |       foo_free.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---parameter
|   |   |       |   |   |           |       constant_both.f90
|   |   |       |   |   |           |       constant_compound.f90
|   |   |       |   |   |           |       constant_integer.f90
|   |   |       |   |   |           |       constant_non_compound.f90
|   |   |       |   |   |           |       constant_real.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---regression
|   |   |       |   |   |           |       inout.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           +---size
|   |   |       |   |   |           |       foo.f90
|   |   |       |   |   |           |       
|   |   |       |   |   |           \---string
|   |   |       |   |   |                   char.f90
|   |   |       |   |   |                   
|   |   |       |   |   +---fft
|   |   |       |   |   |   |   helper.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   _pocketfft.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_helper.py
|   |   |       |   |   |           test_pocketfft.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---lib
|   |   |       |   |   |   |   arraypad.py
|   |   |       |   |   |   |   arraysetops.py
|   |   |       |   |   |   |   arrayterator.py
|   |   |       |   |   |   |   financial.py
|   |   |       |   |   |   |   format.py
|   |   |       |   |   |   |   function_base.py
|   |   |       |   |   |   |   histograms.py
|   |   |       |   |   |   |   index_tricks.py
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   mixins.py
|   |   |       |   |   |   |   nanfunctions.py
|   |   |       |   |   |   |   npyio.py
|   |   |       |   |   |   |   polynomial.py
|   |   |       |   |   |   |   recfunctions.py
|   |   |       |   |   |   |   scimath.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   shape_base.py
|   |   |       |   |   |   |   stride_tricks.py
|   |   |       |   |   |   |   twodim_base.py
|   |   |       |   |   |   |   type_check.py
|   |   |       |   |   |   |   ufunclike.py
|   |   |       |   |   |   |   user_array.py
|   |   |       |   |   |   |   utils.py
|   |   |       |   |   |   |   _datasource.py
|   |   |       |   |   |   |   _iotools.py
|   |   |       |   |   |   |   _version.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |       |   test_arraypad.py
|   |   |       |   |   |       |   test_arraysetops.py
|   |   |       |   |   |       |   test_arrayterator.py
|   |   |       |   |   |       |   test_financial.py
|   |   |       |   |   |       |   test_format.py
|   |   |       |   |   |       |   test_function_base.py
|   |   |       |   |   |       |   test_histograms.py
|   |   |       |   |   |       |   test_index_tricks.py
|   |   |       |   |   |       |   test_io.py
|   |   |       |   |   |       |   test_mixins.py
|   |   |       |   |   |       |   test_nanfunctions.py
|   |   |       |   |   |       |   test_packbits.py
|   |   |       |   |   |       |   test_polynomial.py
|   |   |       |   |   |       |   test_recfunctions.py
|   |   |       |   |   |       |   test_regression.py
|   |   |       |   |   |       |   test_shape_base.py
|   |   |       |   |   |       |   test_stride_tricks.py
|   |   |       |   |   |       |   test_twodim_base.py
|   |   |       |   |   |       |   test_type_check.py
|   |   |       |   |   |       |   test_ufunclike.py
|   |   |       |   |   |       |   test_utils.py
|   |   |       |   |   |       |   test__datasource.py
|   |   |       |   |   |       |   test__iotools.py
|   |   |       |   |   |       |   test__version.py
|   |   |       |   |   |       |   __init__.py
|   |   |       |   |   |       |   
|   |   |       |   |   |       \---data
|   |   |       |   |   |               py2-objarr.npy
|   |   |       |   |   |               py2-objarr.npz
|   |   |       |   |   |               py3-objarr.npy
|   |   |       |   |   |               py3-objarr.npz
|   |   |       |   |   |               python3.npy
|   |   |       |   |   |               win64python2.npy
|   |   |       |   |   |               
|   |   |       |   |   +---linalg
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   linalg.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_build.py
|   |   |       |   |   |           test_deprecations.py
|   |   |       |   |   |           test_linalg.py
|   |   |       |   |   |           test_regression.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---ma
|   |   |       |   |   |   |   bench.py
|   |   |       |   |   |   |   core.py
|   |   |       |   |   |   |   extras.py
|   |   |       |   |   |   |   mrecords.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   testutils.py
|   |   |       |   |   |   |   timer_comparison.py
|   |   |       |   |   |   |   version.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_core.py
|   |   |       |   |   |           test_deprecations.py
|   |   |       |   |   |           test_extras.py
|   |   |       |   |   |           test_mrecords.py
|   |   |       |   |   |           test_old_ma.py
|   |   |       |   |   |           test_regression.py
|   |   |       |   |   |           test_subclassing.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---matrixlib
|   |   |       |   |   |   |   defmatrix.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_defmatrix.py
|   |   |       |   |   |           test_interaction.py
|   |   |       |   |   |           test_masked_matrix.py
|   |   |       |   |   |           test_matrix_linalg.py
|   |   |       |   |   |           test_multiarray.py
|   |   |       |   |   |           test_numeric.py
|   |   |       |   |   |           test_regression.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---polynomial
|   |   |       |   |   |   |   chebyshev.py
|   |   |       |   |   |   |   hermite.py
|   |   |       |   |   |   |   hermite_e.py
|   |   |       |   |   |   |   laguerre.py
|   |   |       |   |   |   |   legendre.py
|   |   |       |   |   |   |   polynomial.py
|   |   |       |   |   |   |   polyutils.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   _polybase.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |           test_chebyshev.py
|   |   |       |   |   |           test_classes.py
|   |   |       |   |   |           test_hermite.py
|   |   |       |   |   |           test_hermite_e.py
|   |   |       |   |   |           test_laguerre.py
|   |   |       |   |   |           test_legendre.py
|   |   |       |   |   |           test_polynomial.py
|   |   |       |   |   |           test_polyutils.py
|   |   |       |   |   |           test_printing.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   +---random
|   |   |       |   |   |   |   bit_generator.pxd
|   |   |       |   |   |   |   common.pxd
|   |   |       |   |   |   |   info.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   _pickle.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   \---tests
|   |   |       |   |   |       |   test_direct.py
|   |   |       |   |   |       |   test_generator_mt19937.py
|   |   |       |   |   |       |   test_generator_mt19937_regressions.py
|   |   |       |   |   |       |   test_random.py
|   |   |       |   |   |       |   test_randomstate.py
|   |   |       |   |   |       |   test_randomstate_regression.py
|   |   |       |   |   |       |   test_regression.py
|   |   |       |   |   |       |   test_seed_sequence.py
|   |   |       |   |   |       |   test_smoke.py
|   |   |       |   |   |       |   __init__.py
|   |   |       |   |   |       |   
|   |   |       |   |   |       \---data
|   |   |       |   |   |               mt19937-testset-1.csv
|   |   |       |   |   |               mt19937-testset-2.csv
|   |   |       |   |   |               pcg64-testset-1.csv
|   |   |       |   |   |               pcg64-testset-2.csv
|   |   |       |   |   |               philox-testset-1.csv
|   |   |       |   |   |               philox-testset-2.csv
|   |   |       |   |   |               sfc64-testset-1.csv
|   |   |       |   |   |               sfc64-testset-2.csv
|   |   |       |   |   |               __init__.py
|   |   |       |   |   |               
|   |   |       |   |   +---testing
|   |   |       |   |   |   |   decorators.py
|   |   |       |   |   |   |   noseclasses.py
|   |   |       |   |   |   |   nosetester.py
|   |   |       |   |   |   |   print_coercion_tables.py
|   |   |       |   |   |   |   setup.py
|   |   |       |   |   |   |   utils.py
|   |   |       |   |   |   |   __init__.py
|   |   |       |   |   |   |   
|   |   |       |   |   |   +---tests
|   |   |       |   |   |   |       test_decorators.py
|   |   |       |   |   |   |       test_doctesting.py
|   |   |       |   |   |   |       test_utils.py
|   |   |       |   |   |   |       __init__.py
|   |   |       |   |   |   |       
|   |   |       |   |   |   \---_private
|   |   |       |   |   |           decorators.py
|   |   |       |   |   |           noseclasses.py
|   |   |       |   |   |           nosetester.py
|   |   |       |   |   |           parameterized.py
|   |   |       |   |   |           utils.py
|   |   |       |   |   |           __init__.py
|   |   |       |   |   |           
|   |   |       |   |   \---tests
|   |   |       |   |           test_ctypeslib.py
|   |   |       |   |           test_matlib.py
|   |   |       |   |           test_numpy_version.py
|   |   |       |   |           test_public_api.py
|   |   |       |   |           test_reloading.py
|   |   |       |   |           test_scripts.py
|   |   |       |   |           test_warnings.py
|   |   |       |   |           __init__.py
|   |   |       |   |           
|   |   |       |   +---numpy-1.17.4.dist-info
|   |   |       |   |       entry_points.txt
|   |   |       |   |       INSTALLER
|   |   |       |   |       LICENSE.txt
|   |   |       |   |       METADATA
|   |   |       |   |       top_level.txt
|   |   |       |   |       
|   |   |       |   \---opencv_contrib_python_headless-4.5.1.48.dist-info
|   |   |       |           INSTALLER
|   |   |       |           LICENSE-3RD-PARTY.txt
|   |   |       |           LICENSE.txt
|   |   |       |           METADATA
|   |   |       |           top_level.txt
|   |   |       |           
|   |   |       +---x86
|   |   |       |   +---chaquopy
|   |   |       |   |   \---lib
|   |   |       |   |           libc++_shared.so
|   |   |       |   |           libgfortran.so.3
|   |   |       |   |           libjpeg_chaquopy.so
|   |   |       |   |           libopenblas.so
|   |   |       |   |           libpng16.so
|   |   |       |   |           
|   |   |       |   +---cv2
|   |   |       |   |       cv2.so
|   |   |       |   |       
|   |   |       |   \---numpy
|   |   |       |       |   __config__.py
|   |   |       |       |   
|   |   |       |       +---core
|   |   |       |       |   |   _dummy.so
|   |   |       |       |   |   _multiarray_tests.so
|   |   |       |       |   |   _multiarray_umath.so
|   |   |       |       |   |   _operand_flag_tests.so
|   |   |       |       |   |   _rational_tests.so
|   |   |       |       |   |   _struct_ufunc_tests.so
|   |   |       |       |   |   _umath_tests.so
|   |   |       |       |   |   
|   |   |       |       |   +---include
|   |   |       |       |   |   \---numpy
|   |   |       |       |   |           _numpyconfig.h
|   |   |       |       |   |           
|   |   |       |       |   \---lib
|   |   |       |       |           libnpymath.a
|   |   |       |       |           
|   |   |       |       +---distutils
|   |   |       |       |       __config__.py
|   |   |       |       |       
|   |   |       |       +---fft
|   |   |       |       |       _pocketfft_internal.so
|   |   |       |       |       
|   |   |       |       +---linalg
|   |   |       |       |       lapack_lite.so
|   |   |       |       |       _umath_linalg.so
|   |   |       |       |       
|   |   |       |       \---random
|   |   |       |               bit_generator.so
|   |   |       |               bounded_integers.so
|   |   |       |               common.so
|   |   |       |               generator.so
|   |   |       |               mt19937.so
|   |   |       |               mtrand.so
|   |   |       |               pcg64.so
|   |   |       |               philox.so
|   |   |       |               sfc64.so
|   |   |       |               
|   |   |       \---x86_64
|   |   |           +---chaquopy
|   |   |           |   \---lib
|   |   |           |           libc++_shared.so
|   |   |           |           libgfortran.so.3
|   |   |           |           libjpeg_chaquopy.so
|   |   |           |           libopenblas.so
|   |   |           |           libpng16.so
|   |   |           |           
|   |   |           +---cv2
|   |   |           |       cv2.so
|   |   |           |       
|   |   |           \---numpy
|   |   |               |   __config__.py
|   |   |               |   
|   |   |               +---core
|   |   |               |   |   _dummy.so
|   |   |               |   |   _multiarray_tests.so
|   |   |               |   |   _multiarray_umath.so
|   |   |               |   |   _operand_flag_tests.so
|   |   |               |   |   _rational_tests.so
|   |   |               |   |   _struct_ufunc_tests.so
|   |   |               |   |   _umath_tests.so
|   |   |               |   |   
|   |   |               |   +---include
|   |   |               |   |   \---numpy
|   |   |               |   |           _numpyconfig.h
|   |   |               |   |           
|   |   |               |   \---lib
|   |   |               |           libnpymath.a
|   |   |               |           
|   |   |               +---distutils
|   |   |               |       __config__.py
|   |   |               |       
|   |   |               +---fft
|   |   |               |       _pocketfft_internal.so
|   |   |               |       
|   |   |               +---linalg
|   |   |               |       lapack_lite.so
|   |   |               |       _umath_linalg.so
|   |   |               |       
|   |   |               \---random
|   |   |                       bit_generator.so
|   |   |                       bounded_integers.so
|   |   |                       common.so
|   |   |                       generator.so
|   |   |                       mt19937.so
|   |   |                       mtrand.so
|   |   |                       pcg64.so
|   |   |                       philox.so
|   |   |                       sfc64.so
|   |   |                       
|   |   \---tmp
|   |       +---compileDebugJavaWithJavac
|   |       |       source-classes-mapping.txt
|   |       |       
|   |       \---expandedArchives
|   |           +---target-3.8.6-0-arm64-v8a.zip_9523e6d1aebfde9890bb48eca80830aa
|   |           |   \---jniLibs
|   |           |       \---arm64-v8a
|   |           |               libcrypto_chaquopy.so
|   |           |               libpython3.8.so
|   |           |               libsqlite3_chaquopy.so
|   |           |               libssl_chaquopy.so
|   |           |               
|   |           +---target-3.8.6-0-armeabi-v7a.zip_804be5735202c0e2db04f1a1d898f0cb
|   |           |   \---jniLibs
|   |           |       \---armeabi-v7a
|   |           |               libcrypto_chaquopy.so
|   |           |               libpython3.8.so
|   |           |               libsqlite3_chaquopy.so
|   |           |               libssl_chaquopy.so
|   |           |               
|   |           +---target-3.8.6-0-x86.zip_1f2b45829cb0922bbff96edb0c50fc2d
|   |           |   \---jniLibs
|   |           |       \---x86
|   |           |               libcrypto_chaquopy.so
|   |           |               libpython3.8.so
|   |           |               libsqlite3_chaquopy.so
|   |           |               libssl_chaquopy.so
|   |           |               
|   |           \---target-3.8.6-0-x86_64.zip_21b044a0318487807c843dc1d6bf4877
|   |               \---jniLibs
|   |                   \---x86_64
|   |                           libcrypto_chaquopy.so
|   |                           libpython3.8.so
|   |                           libsqlite3_chaquopy.so
|   |                           libssl_chaquopy.so
|   |                           
|   \---src
|       +---androidTest
|       |   \---java
|       |       \---com
|       |           \---elevenzon
|       |               \---image
|       |                       ExampleInstrumentedTest.java
|       |                       
|       +---main
|       |   |   AndroidManifest.xml
|       |   |   
|       |   +---java
|       |   |   \---com
|       |   |       \---elevenzon
|       |   |           \---image
|       |   |                   ActivityCheckbox.java
|       |   |                   ActivityQuestionnaire.java
|       |   |                   ActivitySatisfication.java
|       |   |                   CheckboxInfo.java
|       |   |                   DelayedProgressDialog.java
|       |   |                   Detail.java
|       |   |                   ExampleDialog.java
|       |   |                   ExampleDialog2.java
|       |   |                   FirstFragment.java
|       |   |                   FullImageActivity.java
|       |   |                   Home.java
|       |   |                   ImageAdapter.java
|       |   |                   ImageModel.java
|       |   |                   ImagesActivity.java
|       |   |                   MainActivity.java
|       |   |                   MainActivity2.java
|       |   |                   MainActivity3.java
|       |   |                   ProcessActivity.java
|       |   |                   Questionnaire.java
|       |   |                   SecondFragment.java
|       |   |                   SelectedImageAdapter.java
|       |   |                   ShowInfo.java
|       |   |                   Splash.java
|       |   |                   Student.java
|       |   |                   TableInfo.java
|       |   |                   
|       |   +---python
|       |   |       checkbox.py
|       |   |       table.py
|       |   |       
|       |   \---res
|       |       +---drawable
|       |       |       custom_checkbox.xml
|       |       |       gradient_background.xml
|       |       |       ic_arrow_back_white_24dp.xml
|       |       |       ic_camera.xml
|       |       |       ic_camera_white_30dp.xml
|       |       |       ic_checkbox.xml
|       |       |       ic_checked.xml
|       |       |       ic_click.xml
|       |       |       ic_doc.xml
|       |       |       ic_document.xml
|       |       |       ic_export.xml
|       |       |       ic_folder_white_30dp.xml
|       |       |       ic_graph.xml
|       |       |       ic_home.xml
|       |       |       ic_launcher_background.xml
|       |       |       ic_next.xml
|       |       |       ic_previous.xml
|       |       |       ic_send_white_20dp.xml
|       |       |       ic_submit.xml
|       |       |       ic_table.xml
|       |       |       ic_unchecked.xml
|       |       |       ic_view.xml
|       |       |       shadow.xml
|       |       |       splash.xml
|       |       |       
|       |       +---drawable-anydpi
|       |       |       ic_action_name.xml
|       |       |       
|       |       +---drawable-anydpi-v24
|       |       |       ic_stat_name.xml
|       |       |       
|       |       +---drawable-hdpi
|       |       |       ex.png
|       |       |       ic_action_name.png
|       |       |       ic_stat_name.png
|       |       |       
|       |       +---drawable-mdpi
|       |       |       ic_action_name.png
|       |       |       ic_stat_name.png
|       |       |       
|       |       +---drawable-v24
|       |       |       explain.png
|       |       |       ic_add.xml
|       |       |       ic_close.xml
|       |       |       ic_launcher_foreground.xml
|       |       |       pic_app.png
|       |       |       pic_ques.png
|       |       |       round_grey.xml
|       |       |       round_normal.xml
|       |       |       round_primary.xml
|       |       |       
|       |       +---drawable-xhdpi
|       |       |       ic_action_name.png
|       |       |       ic_stat_name.png
|       |       |       
|       |       +---drawable-xxhdpi
|       |       |       bg2.png
|       |       |       ic_action_name.png
|       |       |       ic_stat_name.png
|       |       |       
|       |       +---layout
|       |       |       activity_full_image.xml
|       |       |       activity_images.xml
|       |       |       activity_main.xml
|       |       |       activity_main2.xml
|       |       |       activity_main3.xml
|       |       |       activity_process.xml
|       |       |       activity_splash.xml
|       |       |       content_main2.xml
|       |       |       custom_dialog.xml
|       |       |       custom_dialog2.xml
|       |       |       detail.xml
|       |       |       dialog_progress.xml
|       |       |       fragment_first.xml
|       |       |       fragment_second.xml
|       |       |       home.xml
|       |       |       image_list.xml
|       |       |       image_picker_list.xml
|       |       |       info_checkbox.xml
|       |       |       info_ques.xml
|       |       |       info_satisfication.xml
|       |       |       row.xml
|       |       |       row_tb.xml
|       |       |       selected_image_list.xml
|       |       |       show_info.xml
|       |       |       
|       |       +---mipmap-anydpi-v26
|       |       |       ic_launcher.xml
|       |       |       ic_launcher_round.xml
|       |       |       
|       |       +---mipmap-hdpi
|       |       |       ic_app.png
|       |       |       ic_back2.png
|       |       |       ic_launcher.png
|       |       |       ic_launcher_round.png
|       |       |       
|       |       +---mipmap-mdpi
|       |       |       ic_app.png
|       |       |       ic_back2.png
|       |       |       ic_launcher.png
|       |       |       ic_launcher_round.png
|       |       |       
|       |       +---mipmap-xhdpi
|       |       |       app.png
|       |       |       ic_app.png
|       |       |       ic_back2.png
|       |       |       ic_launcher.png
|       |       |       ic_launcher_round.png
|       |       |       
|       |       +---mipmap-xxhdpi
|       |       |       ic_app.png
|       |       |       ic_back2.png
|       |       |       ic_launcher.png
|       |       |       ic_launcher_round.png
|       |       |       
|       |       +---mipmap-xxxhdpi
|       |       |       ic_app.png
|       |       |       ic_back2.png
|       |       |       ic_launcher.png
|       |       |       ic_launcher_round.png
|       |       |       
|       |       +---navigation
|       |       |       nav_graph.xml
|       |       |       
|       |       +---values
|       |       |       colors.xml
|       |       |       dimens.xml
|       |       |       strings.xml
|       |       |       styles.xml
|       |       |       themes.xml
|       |       |       
|       |       \---xml
|       |               provider_paths.xml
|       |               
|       \---test
|           \---java
|               \---com
|                   \---elevenzon
|                       \---image
|                               ExampleUnitTest.java
|                               
\---gradle
    \---wrapper
            gradle-wrapper.jar
            gradle-wrapper.properties
            

```
### Contact us on

* jks.suphavadee@gmail.com  
* nuthathaina@gmail.com
