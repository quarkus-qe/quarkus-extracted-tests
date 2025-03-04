# Quarkus Extracted Tests project

This project contains tests extracted from [Quarkus main project](https://github.com/quarkusio/quarkus) using the [Quarkus Test Extractor](https://github.com/quarkus-qe/quarkus-test-extractor) tool.
Tests extracted for [Quarkus 3.15.3.1](https://github.com/quarkusio/quarkus/releases/tag/3.15.3.1) based on [its tag](https://github.com/quarkusio/quarkus/tree/3.15.3.1) must pass when run with Quarkus artifacts of the same version.
In other words, if you need to run these tests with different build of Quarkus than is found in Maven central, like with artifacts delivered as Maven repository zip file, you can.

## How it works

### Branching
This project has Git branches that matches Quarkus releases.
For example Quarkus release https://github.com/quarkusio/quarkus/releases/tag/3.15.3.1 matches Git branch 3.15.3.1.
You should expect that existing branches has a counterpart among Quarkus releases.
We may and will delete some branches when we don't need them anymore.

### Extracting new tests

Daily build runs a GitHub workflow that detects new releases and extract tests automatically.
You can trigger this workflow manually or use the Quarkus Test Extractor tool from your workstation and push tests yourselves.

### Rules

Don't push extracted tests to the main branch because it is next to impossible to keep it up to date with the Quarkus main branch (and there is no point).
