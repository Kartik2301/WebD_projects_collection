# Generated by Django 4.1.5 on 2023-01-25 18:51

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('groups', '0003_remove_groupmodel_members_groupmodel_owner_and_more'),
    ]

    operations = [
        migrations.AddField(
            model_name='groupadditionaldetailsmodel',
            name='group_id',
            field=models.ForeignKey(default=None, on_delete=django.db.models.deletion.RESTRICT, to='groups.groupmodel'),
            preserve_default=False,
        ),
    ]
