var variables={
  "name": "@ch-post-app/techsys-automatic-inventory-stream-api",
  "version": "2.0.0-feature-pipeline.5",
  "description": "Automatic Inventory Stream API",
  "scripts": {
    "start": "apikana start src dist",
    "stop": "apikana stop",
    "create-sample": "apikana create-sample",
    "validate-samples": "apikana validate-samples",
    "test": "eslint src --ext .ts && apikana validate-samples",
    "lint": "eslint src --ext .ts",
    "lint-fix": "eslint src --ext .ts --fix",
    "prepublishOnly": "npm test"
  },
  "author": "ruvinskie",
  "license": "Apache-2.0",
  "dependencies": {},
  "devDependencies": {
    "@typescript-eslint/eslint-plugin": "^4.13.0",
    "@typescript-eslint/parser": "^4.13.0",
    "apikana": "^0.9.29",
    "apikana-defaults": "0.0.77",
    "eslint": "^7.17.0",
    "eslint-config-prettier": "^7.1.0",
    "eslint-plugin-prettier": "^3.3.1",
    "prettier": "^2.2.1",
    "typescript": "^4.1.3"
  },
  "customConfig": {
    "type": "stream-api",
    "domain": "post.ch",
    "author": "ruvinskie",
    "namespace": "app.techsys.automatic.inventory",
    "shortName": "automatic-inventory",
    "projectName": "automatic-inventory-stream-api",
    "title": "Automatic Inventory Stream API",
    "plugins": [
      "maven",
      "dotnet",
      "readme"
    ],
    "javaPackage": "ch.post.app.techsys.automatic.inventory.v1",
    "mavenGroupId": "ch.post.app.techsys.automatic",
    "dotnetNamespace": "Ch.Post.App.Techsys.Automatic.Inventory.V1",
    "dotnetPackageId": "Ch.Post.App.Techsys.Automatic.Inventory.StreamApi",
    "mqs": "MQTT",
    "avro": {
      "enumAsString": true
    }
  },
  "_": [
    "start",
    "src",
    "dist"
  ]
}