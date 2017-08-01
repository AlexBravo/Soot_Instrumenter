package bolts;

import java.util.Locale;

public class CancellationTokenSource {
    private final CancellationToken token = new CancellationToken();

    public boolean isCancellationRequested() throws  {
        return this.token.isCancellationRequested();
    }

    public CancellationToken getToken() throws  {
        return this.token;
    }

    public void cancel() throws  {
        this.token.tryCancel();
    }

    public String toString() throws  {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())});
    }
}
