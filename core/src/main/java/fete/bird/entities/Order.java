package fete.bird.entities;

import java.util.UUID;

public record Order(UUID id,
                    String name,
                    String description) {
}
