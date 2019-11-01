package io.crnk.gen.openapi.internal.schemas;

import io.crnk.gen.openapi.internal.MetaResourceBaseTest;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.Schema;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ListResponseMixinTest extends MetaResourceBaseTest {

  @Test
  void schema() {
    Schema schema = new ListResponseMixin().schema();
    Assert.assertTrue(schema instanceof ObjectSchema);
    Assert.assertTrue(schema.getProperties().containsKey("jsonapi"));
    Assert.assertTrue(schema.getProperties().containsKey("errors"));
    Assert.assertTrue(schema.getProperties().containsKey("links"));
    Assert.assertTrue(schema.getProperties().containsKey("meta"));
    Assert.assertEquals(4, schema.getProperties().size());
  }
}