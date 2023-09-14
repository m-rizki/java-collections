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

## Tipe data Character

## Tipe data Boolean

default value boolean : false

## Tipe data String

default value untuk string : null

### menggabungkan String

## Variable

### var keyword - since java 10

### final keyword

javascript variable is mutable variable

final -> immutable variable

## Tipe data bukan primitif

- tipe data primitif selalu memiliki default value
- String bukan tipe data primitif, string adalah tipe data objek, semua tipe data objek jika tidak di assign valuenya maka default valuenya null
- tipe data bukan primitif bisa memiliki method/function
- di Java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya

| Primitive | Not Primitive
| ---------- | ----------- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |
|  | String |

## Tipe data Array

### Array initializer

### Operasi di Array

| Operasi Array | Keterangan
| ---------- | ----------- |
| array[index] | mengambil data di array |
| array[index] = value | mengubah data di array |
| array.length | mengambil panjang array |

### Array di dalam array
