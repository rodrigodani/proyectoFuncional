from django.urls import path
from . import views

urlpatterns=[
    path('registro/',views.show_form, name='registro'),
    path('fib/',views.fib, name='fib'),
    path('calcu/',views.calcu, name='calcu'),
    path('calcuM/',views.calcuM, name='calcuM'),
    path('fac/',views.fac, name='fac'),
    path('primo/',views.primo, name='primo')


]