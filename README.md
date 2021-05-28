# Bank App - UI Clone



**Applied Pattern**

* MVVM



**Integration**

* Firebase

  

**View Components**

* Cards - [Material Design](https://material.io/design) 
* Icons - [Google Fonts](https://fonts.google.com/icons)



**Dependences**

Add to build.gradle(Module)

* Lifecycle components
  
  ​	In dependences:
  
  * implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
  * implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
  * implementation "androidx.lifecycle:lifecycle-common-java8:2.2.0"
  
* Firebase SDK and Analytics:

  * apply plugin: 'com.google.gms.google-services'

    In dependences:

  * implementation platform('com.google.firebase:firebase-bom:28.0.1')

  * implementation 'com.google.firebase:firebase-analytics-ktx'

Add to build.gradle(Project)

* Firebase SDK
  * classpath 'com.google.gms:google-services:4.3.8'



**Available Languages**

* Portuguese Brazil (pt-br)
* English (en)

