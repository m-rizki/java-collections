# Java dasar

[slide](https://docs.google.com/presentation/d/1KitIRSpsnnlBiXN05BSNg2GWwtcfCN_vvILaPb-P9Ek/edit)

Agenda :

- Pengenalan Java
- Instalasi Java
- Tipe data di Java
- Operator
- Percabangan
- Perulangan
- Methods

## Intro

Write once, ~~debug~~ run anywhere

## Installation

[Open JDK](https://jdk.java.net/)

- download - extract
- setting path untuk akses code dari terminal
  - [windows](https://medium.com/programmer-zaman-now/setting-java-path-di-windows-4da2c65d8298)

### Create java project using vscode

- download extension pack
- ctrl + shift + p
- java: create java projects
- [setting user configuration for java compailer](https://github.com/redhat-developer/vscode-java/wiki/JDK-Requirements#java.configuration.runtimes)

## Data Type - Number

- integer
- float

### Integer

| Name | Size | Values | Default
|----| --- | --------------------------- | ----------- |
| byte | 1-bytes | -128 **to** 127 | 0 |
| short | 2-bytes | -32,768 **to** 32,767 | 0 |
| int | 4-bytes | -2,147,483,648 **to** 2,147,483,647 | 0 |
| long | 8-byte | -9,223,372,036,854,775,808 **to** 9,223,372,036,854,775,807 | 0 |

### Float

| Name | Size | Values | Default
|----| --- | --------------------------- | ----------- |
| float | 4-bytes | 3.4e-038 **to** 3.4e+038 | 0.0 |
| double | 8-bytes | 1.7e-038 **to** 1.7e+038 | 0.0 |

### Literals

- decimal
- hex
- binary

### Underscore - java 8+

### konversi tipe data number

widening casting (otomatis) : byte -> short -> int -> long -> float -> double
narrowing casting (manual) : double -> float -> long -> int -> short -> byte
