# ASPEX-Compiler
[![](https://jitpack.io/v/Saint-Theana/ASPEX-Compiler.svg)](https://jitpack.io/#Saint-Theana/ASPEX-Compiler)
l
# A Protobuf compiler based on [antlr4](https://github.com/antlr/antlr4)

# Decoder/Encoder: [ASPEX](https://github.com/Saint-Theana/ASPEX)

To add this library:
[jitpack](https://jitpack.io/#Saint-Theana/ASPEX-Compiler)
```groovy
lallprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
	
dependencies {
	implementation 'com.github.Saint-Theana:ASPEX-Compiler:1.0.0'
}
```

# implemented feature:
 - [x] 1.basic type transform
 - [x] 1.import adapt
 - [ ] 2.enum transform


# How to use

## 1: 

```java
    new ProtobufCompiler(your input proto sorce code directory).compile(path to output java class);
```


## License
```
Copyright (C) 2023-2025  Saint-Theana

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
USA

Please contact Saint-Theana by email the.winter.will.come@gmail.com if you need
additional information or have any questions
```