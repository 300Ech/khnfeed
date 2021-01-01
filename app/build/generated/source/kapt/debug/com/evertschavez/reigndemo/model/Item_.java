
package com.evertschavez.reigndemo.model;

import com.evertschavez.reigndemo.model.ItemCursor.Factory;
import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "Item". Can be used for QueryBuilder and for referencing DB names.
 */
public final class Item_ implements EntityInfo<Item> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "Item";

    public static final int __ENTITY_ID = 2;

    public static final Class<Item> __ENTITY_CLASS = Item.class;

    public static final String __DB_NAME = "Item";

    public static final CursorFactory<Item> __CURSOR_FACTORY = new Factory();

    @Internal
    static final ItemIdGetter __ID_GETTER = new ItemIdGetter();

    public final static Item_ __INSTANCE = new Item_();

    public final static io.objectbox.Property<Item> objectID =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "objectID", true, "objectID");

    public final static io.objectbox.Property<Item> created_at =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, String.class, "created_at");

    public final static io.objectbox.Property<Item> title =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, String.class, "title");

    public final static io.objectbox.Property<Item> url =
        new io.objectbox.Property<>(__INSTANCE, 3, 4, String.class, "url");

    public final static io.objectbox.Property<Item> author =
        new io.objectbox.Property<>(__INSTANCE, 4, 5, String.class, "author");

    public final static io.objectbox.Property<Item> points =
        new io.objectbox.Property<>(__INSTANCE, 5, 6, String.class, "points");

    public final static io.objectbox.Property<Item> story_text =
        new io.objectbox.Property<>(__INSTANCE, 6, 7, String.class, "story_text");

    public final static io.objectbox.Property<Item> comment_text =
        new io.objectbox.Property<>(__INSTANCE, 7, 8, String.class, "comment_text");

    public final static io.objectbox.Property<Item> num_comments =
        new io.objectbox.Property<>(__INSTANCE, 8, 9, String.class, "num_comments");

    public final static io.objectbox.Property<Item> story_id =
        new io.objectbox.Property<>(__INSTANCE, 9, 10, long.class, "story_id");

    public final static io.objectbox.Property<Item> story_title =
        new io.objectbox.Property<>(__INSTANCE, 10, 11, String.class, "story_title");

    public final static io.objectbox.Property<Item> story_url =
        new io.objectbox.Property<>(__INSTANCE, 11, 12, String.class, "story_url");

    public final static io.objectbox.Property<Item> parent_id =
        new io.objectbox.Property<>(__INSTANCE, 12, 13, long.class, "parent_id");

    public final static io.objectbox.Property<Item> created_at_i =
        new io.objectbox.Property<>(__INSTANCE, 13, 14, long.class, "created_at_i");

    public final static io.objectbox.Property<Item> elapsedTime =
        new io.objectbox.Property<>(__INSTANCE, 14, 15, String.class, "elapsedTime");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<Item>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        objectID,
        created_at,
        title,
        url,
        author,
        points,
        story_text,
        comment_text,
        num_comments,
        story_id,
        story_title,
        story_url,
        parent_id,
        created_at_i,
        elapsedTime
    };

    public final static io.objectbox.Property<Item> __ID_PROPERTY = objectID;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<Item> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<Item>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<Item> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<Item> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<Item> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class ItemIdGetter implements IdGetter<Item> {
        @Override
        public long getId(Item object) {
            return object.getObjectID();
        }
    }

}
