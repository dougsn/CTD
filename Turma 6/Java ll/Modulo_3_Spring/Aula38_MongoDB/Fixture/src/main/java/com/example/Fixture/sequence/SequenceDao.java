package com.example.Fixture.sequence;

public interface SequenceDao {
    long getNextSequenceId(String key) throws SequenceException;
}
