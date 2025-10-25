package br.com.movieflix.mapper;

import br.com.movieflix.controller.request.CategoryRequest;
import br.com.movieflix.controller.response.CategoryResponse;
import br.com.movieflix.entity.Category;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryMapper {

    public static Category toCategory(CategoryRequest categoryrequest){
       return Category
               .builder()
               .name(categoryrequest.name())
               .build();
    }

    public static CategoryResponse toCategoryResponse (Category category ){
        return CategoryResponse
                .builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
