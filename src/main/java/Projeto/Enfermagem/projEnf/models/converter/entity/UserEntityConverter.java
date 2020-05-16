package Projeto.Enfermagem.projEnf.models.converter.entity;

import Projeto.Enfermagem.projEnf.datastore.database.entity.User;
import Projeto.Enfermagem.projEnf.models.model.UserModel;
import Projeto.Enfermagem.projEnf.resource.util.MapperUtil;
import Projeto.Enfermagem.projEnf.template.converters.EntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserEntityConverter extends EntityConverter<User, UserModel> {
    private final MapperUtil mapperUtil;
    @Override
    protected User toEntityImpl(UserModel model) {
        return mapperUtil.use().map(model, User.class);
    }

    @Override
    protected UserModel toModelImpl(User entity) {
        return mapperUtil.use().map(entity, UserModel.class);
    }
}
