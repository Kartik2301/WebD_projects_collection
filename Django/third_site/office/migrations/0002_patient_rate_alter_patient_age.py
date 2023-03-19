# Generated by Django 4.1.5 on 2023-01-13 14:21

import django.core.validators
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('office', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='patient',
            name='rate',
            field=models.IntegerField(default=60, validators=[django.core.validators.MaxValueValidator(220), django.core.validators.MinValueValidator(1)]),
        ),
        migrations.AlterField(
            model_name='patient',
            name='age',
            field=models.IntegerField(validators=[django.core.validators.MaxValueValidator(120), django.core.validators.MinValueValidator(0)]),
        ),
    ]
