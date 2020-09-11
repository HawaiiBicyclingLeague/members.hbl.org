package io.redvox.android_utils.movement;

import java.util.List;

public class MovementDetector {
    public static List<MovementDetectionResult> detectMovement(final float[] samples,
                                                               final long bufferSize,
                                                               final float scaling,
                                                               final float threshold) {
        final float[] samplesSq = vecSq(samples);
        final float[] cumSum = new float[samples.length - 1];

    }

    private static float[] vecSq(final float[] samples) {
        final float[] squared = new float[samples.length];
        for(int i = 0; i < samples.length; i++) {
            final float sample = samples[i];
            squared[i] = sample * sample;
        }
        return squared;
    }
}
