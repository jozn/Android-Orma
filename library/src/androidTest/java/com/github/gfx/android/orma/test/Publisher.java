package com.github.gfx.android.orma.test;

import com.google.gson.annotations.SerializedName;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.Table;

@Table(value = "publishers", schemaClassName = "PublisherSchema", relationClassName = "SchemaRelation")
public class Publisher {

    @Column(unique = true)
    String name;

    @Column
    @SerializedName("started_year")
    int startedYear;

    @Column("started_month")
    int startedMonth;

    // TODO: has-many relations for Book
    // @Column HasMany<Book> books;
}
