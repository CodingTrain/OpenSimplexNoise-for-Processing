package thecodetrain.algorithms.noise;


/**
 * Wrapper for Kurt Spencer's open simplex noise implementation in Java
 *
 * @example OSNoise1D
 * @example OSNoise2D
 */
public class OpenSimplexNoise {
	
	private OpenSimplexNoiseKS generator;
	
	public final static String VERSION = "##library.prettyVersion##";
	

	/**
	 * Constructs a new OpenSimplexNoise object,
	 * using the system's current time as the noise seed.
	 */
	public OpenSimplexNoise() {
		this(System.currentTimeMillis());
	}
	
	/**
	* Constructs a new OpenSimplexNoise object,
	* using the provided value as the noise seed.
	 *
	 * @param seed The seed to be used for the noise generator
	*/
	public OpenSimplexNoise(long seed) {
		welcome();
		generator = new OpenSimplexNoiseKS(seed);
	}
	
	
	private void welcome() {
		System.out.println("##library.name## ##library.prettyVersion## by ##author##");
	}

	private double remap(double val) {
		return (val + 1) * 0.5;
	}

	/**
	 * Get a 1D noise value based on the offset
	 *
	 * @param xoff the amount of offset to go in the noise space
	 * @return returns the actual value of the given offset
	 */
	public float noise (float xoff) {
		return this.noise(xoff, 0);
	}

	/**
	 * Get a 2D noise value based on the offset
	 *
	 * @param xoff the amount of x offset to go in the noise space
	 * @param yoff the amount of y offset to go in the noise space
	 * @return returns the actual value of the given offsets
	 */
	public float noise (float xoff, float yoff) {
		return (float) remap(generator.eval(xoff, yoff));
	}

	/**
	 * Get a 3D noise value based on the offset
	 *
	 * @param xoff the amount of x offset to go in the noise space
	 * @param yoff the amount of y offset to go in the noise space
	 * @param zoff the amount of z offset to go in the noise space
	 * @return returns the actual value of the given offsets
	 */
	public float noise (float xoff, float yoff, float zoff) {
		return (float) remap(generator.eval(xoff, yoff, zoff));
	}

	/**
	 * Get a 4D noise value based on the offsets
	 *
	 * @param xoff the amount of x offset to go in the noise space
	 * @param yoff the amount of y offset to go in the noise space
	 * @param zoff the amount of z offset to go in the noise space
	 * @param uoff the amount of u offset to go in the noise space
	 * @return returns the actual value of the given offsets
	 */
	public float noise (float xoff, float yoff, float zoff, float uoff) {
		return (float) remap(generator.eval(xoff, yoff, zoff, uoff));
	}
	
	
	/**
	 * return the version of the Library.
	 * 
	 * @return String
	 */
	public static String version() {
		return VERSION;
	}
}

