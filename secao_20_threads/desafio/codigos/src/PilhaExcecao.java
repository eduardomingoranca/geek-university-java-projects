import java.io.Serial;
import java.io.Serializable;

public class PilhaExcecao extends Throwable implements Serializable {

    @Serial
    private static final long serialVersionUID = -3042686055658047285L;

    public PilhaExcecao(String message) {
        super(message);
    }

}
