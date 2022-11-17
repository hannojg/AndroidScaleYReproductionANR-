# Reproduction

1. Clone this repository
2. Open it in android studio
3. Launch it on a Pixel 4 Android API 33
4. Press in the bottom area to open the `EditText`
5. Enter text repeatedly with adb:

```bash
adb shell input text "Lorem\ ipsum\ dolor\ sit\ amet,\ consetetur\ sadipscing\ elitr,\ sed\ diam\ nonumy\ eirmod\ tempor\ invidunt\ ut\ labore\ et\ dolore\ magna\ aliquyam\ erat,\ sed\ diam\ voluptua.\ At\ vero\ eos\ et\ accusam\ et\ justo\ duo\ dolores\ et\ ea\ rebum.\ Stet\ clita\ kasd\ gubergren,\ no\ sea\ takimata\ sanctus\ est\ Lorem\ ipsum\ dolor\ sit\ amet.\ Lorem\ ipsum\ dolor\ sit\ amet,\ consetetur\ sadipscing\ elitr,\ sed\ diam\ nonumy\ eirmod\ tempor\ invidunt\ ut\ labore\ et\ dolore\ magna\ aliquyam\ erat,\ sed\ diam\ voluptua.\ At\ vero\ eos\ et\ accusam\ et\ justo\ duo\ dolores\ et\ ea\ rebum.\ Stet\ clita\ kasd\ gubergren,\ no\ sea\ takimata\ sanctus\ est\ Lorem\ ipsum\ dolor\ sit\ amet."
```