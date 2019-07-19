## Noise Algorithm Library for Processing

This repo is a work-in-progress library for additional noise algorithms in Processing. There are currently implementations for:

* [x] Open Simplex Noise
* [ ] Worley Noise
* add your noise algorithm here!

## Tutorials

This library was made for the video tutorial series "How to Make a Processing (Java) Library".

* Part 1: https://youtu.be/pI2gvl9sdtE
* Part 2: https://youtu.be/U0TGZCEWn8g

## API

```java

// Create a noise object, optional 2nd argument for seed
OpenSimplexNoise generator = new OpenSimplexNoise(this);

// Get a noise value
float xoff = 0.3;
float val = generator.noise(xoff);
```

