# AutoTypeTextView
![AutoTypeTextView all animations](http://www.dragankrstic.com/autotypetextview/allanimation.gif)

AutoTypeTextView is simple android library which is extending TextView with several auto typing animations. It simulate typing, encrypting a text and decrypting a text animation. You can define a speed of every animation and in the case of typing with mistakes, you can define a precision. 

There are 4 type of animations:
  - Auto typing with mistakes
  - Auto typing without mistakes
  - Encrypit animation
  - Decrypt animation

## Installation
Installation of AutoTypeTextView is preety simple. Just add in build.gradle
```
compile 'com.krsticdragan:autotypetextview:1.1'
```

## Usage

### XML

Add a new namespace which you will use for adding AutoTypeTextView and using its tags. 
```
xmlns:attv="http://schemas.android.com/apk/res-auto"
```
So your root layout will look something like this.
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:attv="http://schemas.android.com/apk/res-auto"
```
After that you will need to define AutoTypeTextView by adding it in your XML. Now you can use a namespace which are we already defined. 
```
<com.dragankrstic.autotypetextview.AutoTypeTextView
        android:id="@+id/lblTextWithoutMistakes"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        attv:animateTextTypeWithoutMistakes="Hello World!" />
```

## Animations

### Defining animation speed

Typing speed, Encryption speed and Decryption speed can be defined in XML by using:
```
attv:encryptionSpeed = 50
attv:decryptionSpeed = 50
attv:typingSpeed = 80
```
or programmatically by defining a speed in ms.
```
lblTextWithoutMistakes.setTypingSpeed(100);
lblTextDecryption.setDecryptionSpeed(30);
lblTextEncryption.setEncryptionSpeed(30);
```
When you are using TypingWithMistakes, you need to setup precision in order to define how many mistakes you will animate. 
```
attv:typingPrecision=8
```

## AutoTypingWithoutMistakes

Setup Auto Typing Animation without mistakes in XML by using:
```
attv:typingSpeed="100"
attv:animateTextTypeWithoutMistakes="Hello World!"
```
or programmatically by using a function 
```
lblTextWithoutMistakes.setTypingSpeed(100);
lblTyping.setTextAutoTyping("Hello World!");
```

## AutoTypingWithMistake
Setup Auto Typing animation in XML by defining:
```
attv:animateTextTypeWithMistakes="Hello World!"
attv:typingPrecision=8
```
Precision can be set programatically by defining it using AutoTypeTextView.PRECISSION_LOW, AutoTypeTextView.PRECISSION_MED, AutoTypeTextView.PRECISSION_HIGH.
```
lblTextWithMistakes.setTextAutoTypingWithMistakes("Hello World! This is AutoTypeTextView.", AutoTypeTextView.PRECISSION_MED);
```

## animateEncryption
Setup Encryption animation in XML by defining:
```
attv:animateEncryption="Hello World!"
attv:encryptionSpeed="20"
```
or programmatically
```
lblTextEncryption.setEncryptionSpeed(20);
lblTextEncryption.animateEncryption("Hello World!");
```

## animateDecryption
Setup Decryption animation:
```
attv:decryptionSpeed="50"
attv:animateDecryption="Hello World!" 
```
or programmatically
```
lblTextDecryption.setDecryptionSpeed(50);
lblTextDecryption.animateDecryption("Hello World! This is AutoTypeTextView");
```


