package io.redvox.android_utils.movement;

public class MovementDetectionResult {
    public final long startIdx;
    public final long endIdx;

    public MovementDetectionResult(final long startIdx, final long endIdx) {
        this.startIdx = startIdx;
        this.endIdx = endIdx;
    }
}
