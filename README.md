# Logging Library – Quarkus Extension (Basic Version)
A simple Quarkus extension that provides a caller-aware logging abstraction and integrates cleanly with Quarkus’s runtime and build-time ecosystem.

## Features

- Auto-injected logger (@Inject JLogger)

- Caller-aware logs using StackWalker

- Runtime/deployment separation for Quarkus extension API

- Zero configuration needed

- Lightweight and extendable

## Project Structure
 ````
logging-lib/
├── logging-lib-core/
├── logging-lib-runtime/
└── logging-lib-deployment/
````

## Installation
add this below dependency in your quarkus maven projects:

```
<dependency>
    <groupId>com.logging</groupId>
    <artifactId>logging-lib-runtime</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
add this below dependency in your quarkus gradle projects:
````
  implementation 'com.logging:logging-lib-runtime:1.0.0-SNAPSHOT'
  ````
## Example Usage

```
@Inject
JLogger log;

public void create() {
    log.info("Creating resource...");
}
```

