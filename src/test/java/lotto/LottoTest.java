package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("stringToInt 테스트.")
    @Test
    void stringToInt_TEST() {
        assertEquals(2000, Application.stringToInt("2000"));
        assertEquals(3333, Application.stringToInt("3333"));
        assertThatThrownBy(() -> Application.stringToInt("2000j"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("checkMultiple1000 테스트.")
    @Test
    void checkMultiple1000_TEST() {
        assertThatThrownBy(() -> Application.checkMultiple1000(2200))
                .isInstanceOf(IllegalArgumentException.class);
    }

}