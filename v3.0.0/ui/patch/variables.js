var variables={
  "name": "@ch-post-app/atg-automatic-inventory-stream-api",
  "version": "3.0.0",
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
  "author": "Swiss Post Sorting System Development",
  "license": "Apache-2.0",
  "dependencies": {},
  "devDependencies": {
    "@typescript-eslint/eslint-plugin": "^4.33.0",
    "@typescript-eslint/parser": "^4.33.0",
    "apikana": "^0.9.30",
    "apikana-defaults": "0.0.77",
    "eslint": "^7.32.0",
    "eslint-config-prettier": "^7.1.0",
    "eslint-plugin-prettier": "^3.4.1",
    "prettier": "^2.7.1",
    "typescript": "^4.7.4"
  },
  "customConfig": {
    "type": "stream-api",
    "domain": "post.ch",
    "author": "Swiss Post Sorting System Development",
    "namespace": "app.atg.automatic.inventory",
    "shortName": "automatic-inventory",
    "projectName": "automatic-inventory-stream-api",
    "title": "Automatic Inventory Stream API",
    "plugins": [
      "maven",
      "dotnet",
      "readme"
    ],
    "javaPackage": "ch.post.app.atg.automatic.inventory.v1",
    "mavenGroupId": "ch.post.app.atg.automatic",
    "dotnetNamespace": "Ch.Post.App.Atg.Automatic.Inventory.V1",
    "dotnetPackageId": "Ch.Post.App.Atg.Automatic.Inventory.StreamApi",
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