# Generated by Django 4.1.5 on 2023-01-26 12:26

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('groups', '0004_groupadditionaldetailsmodel_group_id'),
    ]

    operations = [
        migrations.AlterField(
            model_name='groupadditionaldetailsmodel',
            name='uploaded_image',
            field=models.ImageField(default=None, upload_to='group_thumbs/'),
            preserve_default=False,
        ),
    ]