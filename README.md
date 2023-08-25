# BLE Data Class for Java
data classes for ble advertising/characteristic/descriptor

see [https://github.com/im97mori-github/JavaBLEUtil/wiki](https://github.com/im97mori-github/JavaBLEUtil/wiki)

## Download
project/build.gradle

    repositories {
        maven { url "https://github.com/im97mori-github/maven/raw/master" }
        google()
        mavenCentral()
    }

project/module/build.gradle

    def version = '0.8.13' 
    dependencies {
        
	     // All package
        implementation "org.im97mori:ble-java:${version}"
        
        // Core package(Constants + Utility)
        implementation "org.im97mori:ble-core:${version}"
        
        // Constants defination classes
        
	     // All constants package
        implementation "org.im97mori:ble-core-constants:${version}"
        
        // Appearance UUID defination
        // (Appearance Values Revision Date: 2021­04­20)
        implementation "org.im97mori:ble-core-constants-appearance:${version}"
        
        // Characteristic UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-characteristic:${version}"
        
        // Characteristic UUID defination
        // (https://www.bluetooth.com/specifications/assigned-numbers/company-identifiers/ 2021-10-19)
        implementation "org.im97mori:ble-core-constants-company:${version}"
        
        // Descriptor UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-descriptor:${version}"
        
        // Declaration UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-declaration:${version}"
        
        // Declaration UUID defination
        // (Core Specification v5.3 Vol 3 Part F 3.4.1)
        // (Supplement to the Bluetooth Core Specification v10 Part B 1.2)
        implementation "org.im97mori:ble-core-constants-errorcode:${version}"
        
        // Profile UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-profile:${version}"
        
        // Protocol Identifier UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-protocol:${version}"
        
        // Scheme UUID defination
        // (URI Scheme Name String Mapping Revision Date: 2021-05-14)
        implementation "org.im97mori:ble-core-constants-scheme:${version}"
        
        // SDO GATT Service UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-sdo:${version}"
        
        // Service UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-service:${version}"
        
        // Unit UUID defination
        // (16-bit UUID Numbers Document Revision Date: 2021-10-01)
        implementation "org.im97mori:ble-core-constants-unit:${version}"
        
        // Core utility classes
        implementation "org.im97mori:ble-core-utils:${version}"
        
        // Advertising classes
        // (Supplement to the Bluetooth Core Specification Revision: v10)
        // Only EIR / AD / SRD / ACAD are supported.(no OOB)
        implementation "org.im97mori:ble-advertising:${version}"
        
        // Characteristic package
        
        // All available characteristic package
        implementation "org.im97mori:ble-characteristic:${version}"
        
        // Characteristic utility classes
        implementation "org.im97mori:ble-characteristic-core:${version}"
        
        // Individual characteristic class
        // XXXX is characteristic 16bit UUID(hexadecimal)
        implementation "org.im97mori:ble-characteristic-uXXXX:${version}"
        
        // ex) Device Name characteristic(UUID 0x2a00)
        implementation "org.im97mori:ble-characteristic-u2a00:${version}"
        
        // Descriptor package
        
        // All available descriptor package
        implementation "org.im97mori:ble-descriptor:${version}"
        
        // Individual descriptor class
        // XXXX is descriptor 16bit UUID(hexadecimal)
        implementation "org.im97mori:ble-descriptor-uXXXX:${version}"
        
        // ex) Client Characteristic Configuration descriptor(UUID 0x2902)
        implementation "org.im97mori:ble-descriptor-u2902:${version}"
    }
