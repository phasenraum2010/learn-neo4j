package org.woehlke.learn.learnneo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Setter
@Getter
@NodeEntity
public class Platform {

    @Id
    @GeneratedValue
    private Long id;

    private String platform;

    public Platform() {
    }

    public Platform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "id=" + id +
                ", platform='" + platform + '\'' +
                '}';
    }
}