package nl.kooi.sfgdi.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PrimaryGreetingService implements GreetingService {
    private final GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();

    }
}
