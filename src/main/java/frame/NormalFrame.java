package frame;

import java.util.List;
import java.util.Objects;

public class NormalFrame implements Frame {
    private static final int FIRST_FRAME_NUMBER = 1;

    private final FrameNumber frameNumber;
    private final List<Integer> scores;

    public static NormalFrame firstNormalFrame(List<Integer> scores) {
        return new NormalFrame(FIRST_FRAME_NUMBER, scores);
    }

    NormalFrame(int frameNumber, List<Integer> scores) {
        this.frameNumber = new FrameNumber(frameNumber);
        this.scores = scores;
    }

    public NormalFrame nextNormalFrame(List<Integer> scores) {
        return new NormalFrame(frameNumber.next(), scores);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NormalFrame that = (NormalFrame) o;
        return Objects.equals(frameNumber, that.frameNumber) &&
                Objects.equals(scores, that.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameNumber, scores);
    }
}
