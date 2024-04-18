package com.nplusone.record;

import java.util.List;

public record AuthorWithBooks(Long id, String name, List<BookRecord> books) {}