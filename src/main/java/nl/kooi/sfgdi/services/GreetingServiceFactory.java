package nl.kooi.sfgdi.services;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }

}
