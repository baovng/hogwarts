package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.service.ArtifactService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArtifactControllerTest {
    @Mock
    ArtifactService artifactService;

    @InjectMocks
    ArtifactController controller;

    List<Artifact> list ;
    @BeforeEach
    void setUp() {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904193");
        a2.setName("Invisiblitity Cloak");
        a2.setDescription("The Deluminator, also referred to as a \"Put-Outer\", is a small magical device that looks like a cigarette lighter. It captures and stores a light source, like a streetlight, and can later be used to restore the light to its original place.");
        a2.setImageUrl("imageUrl");

        list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {

    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}