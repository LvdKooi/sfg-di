package nl.kooi.sfgdi.examplebeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FakeJmsBroker {
    public String user;
    public String password;
    public String url;

}
