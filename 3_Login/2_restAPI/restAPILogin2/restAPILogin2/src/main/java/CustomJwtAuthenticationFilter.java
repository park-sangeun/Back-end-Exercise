import com.restAPI.restAPILogin2.JwtAuthenticationFilter;
import com.restAPI.restAPILogin2.JwtTokenProvider;

public abstract class CustomJwtAuthenticationFilter extends JwtAuthenticationFilter {
    public CustomJwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
        super(jwtTokenProvider);
    }
}
